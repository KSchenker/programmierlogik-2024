# IDE, Debugger, SDK

Eine **integrierte Entwicklungsumgebung (IDE)** ist eine Software, die mehrere Entwicklungswerkzeuge in einer grafischen Schnittstelle vereint. Die IDE bietet alle Funktionen, die für das Schreiben, Ausführen, Dokumentieren und Testen von Software notwendig sind. 

Bestandteil einer IDE ist meistens auch ein Tool namens **Debugger**. Mit einem Debugger kann man ein Programm schrittweise ausführen und logische Fehler im Programmcode aufspüren.

Ein **Software Development Kit (SDK)** ist ein Bündel aus Entwicklungswerkzeugen, das für die Übersetzung, Ausführung und das Testing verwendet wird. Wir nutzen in diesem Modul das **Java Development Kit (JDK)**, um Java-Programme zu entwickeln.

# Datentypen

Im Speicher befinden sich nur "Einsen und Nullen". Diese Bitmuster müssen aber interpretiert werden, also mit einer Bedeutung versehen werden. Hier kommen die Datentypen ins Spiel.

Ein Datentyp legt folgendes fest:

- Die **Bedeutung** eines Bitmusters, das sich im Speicher befindet
- Einen **Wertebereich**
  - Beispiel: Datentyp Zahl erlaubt die Zahlen im Bereich -128 bis +127.
  - Beispiel: Datentyp Wahrheitswert erlaubt nur die Werte "wahr" und "falsch".
  - Beispiel: Datentyp Zeichenkette erlaubt unendlich viele Werte, also beliebige Verkettungen von einzelnen Zeichen.
- Die **Operationen**, die auf einen Wert angewandt werden können. 
  - Beispiel: Datentyp Zahl erlaubt Addition, Subtraktion, Multiplikation. 
  - Beispiel: Datentyp Zeichenkette erlaubt Zusammenfügen, Ersetzen, Suchen etc.
  - Beispiel: Datentyp Wahrheitswert erlaubt nur Vergleiche mit "wahr" und "falsch".
- Verhindert unsinnige bzw. fehlerhafte Anweisungen wie "Subtrahieren zweier Zeichenketten" oder "Aufrufen einer Zeichenkette".
- Fördert das **Verständnis** und die **Lesbarkeit** von Quelltext.
- Definiert den **Speicherbedarf** von Werten bzw. Variablen.
  - Beispiel: In Java hat eine ganze Zahl einen Speicherbedarf von 32 Bits und eine Gleitkommazahl einen Speicherbedarf von 64 Bits.

Es gibt Programmiersprachen, die statisches Type-Checking verwenden und Programmiersprachen, die dynamisches Type-Checking benutzen.

Beim **statischen Type-Checking** überprüft der Compiler _vor der Ausführung_ des Programms, ob dieses typkonforme Anweisungen enthält.

Beim **dynamischen Type-Checking** wird _während der Ausführung_ des Programms geprüft, ob die Anweisungen typkonform sind.

Java verwendet sowohl statisches Type-Checking durch den Compiler und dynamisches Type-Checking durch die Java Virtual Machine.

Verletzt ein Programm die Typregeln, führt das beim statischen Type-Checking zu einem Übersetzungsabbruch und beim dynamischen Type-Checking zu einem Programmabbruch.

## Die wichtigsten Datentypen im Überblick

- **String**: Eine Verkettung von beliebig vielen Zeichen. Leere Zeichenketten sind erlaubt. Der Speicherbedarf ist abhängig von der Zeichenanzahl.
  - Man verwendet ihn für Text.
  - Unterstützt keine numerischen Berechnungen.
  - Man kann Strings sortieren (lexikographische Sortierung).
  - Strings haben viele Funktionen: Textsuche, Textersetzung, Groß- und Kleinschreibung umschalten etc.
- **Integer (int)**: Eine vorzeichenbehaftete ganze Zahl mit einem Speicherbedarf von 32 Bits.
  - Wertebereich: -2147483648 bis 2147483647
  - Unterstützt alle gängigen mathematischen Operationen wie Addition, Subtraktion, Multiplikation, Division etc.
  - Kann sehr performant (zügig, schnell) auf der Hardware verrechnet werden.
  - Hinweise: Ein `int` speichert keine führenden Nullen. Beispiel: `00123` wird nur als `123` gespeichert.
  - Hinweis: Ein `int` verwendet das _Zweierkomplement_ um negative und positive Zahlen zu kodieren.
- **Character (char)**: Speichert genau ein Zeichen. In Java hat ein char einen Speicherbedarf von 16 Bits.
  - Wertebereich: `\u0000` bis `\uFFFF`.
  - Intern verwendet Java die Zeichenkodierung UTF-16. Eine Zeichenkodierung legt für jedes Zeichen eines Zeichensatzes einen numerischen Wert / Bitmuster fest. Im Falle des Unicode-Zeichensatzes spricht man dann vom Unicode-Codepoint eines Zeichens. Beispiel: Der Codepoint für das Zeichen `:` ist die Hexadezimalzahl `0x003A`.
  - Ein character unterstützt u.a. folgende Operationen: Umwandlung in numerische Kodierung und umgekehrt. Prüfen, um welche Art von Zeichen es sich handelt, z.B. Buchstabe, Ziffer, Satzzeichen etc.
- **Wahrheitswert (boolean)**: Repräsentiert entweder den Wert `true` oder den Wert `false`. Der Speicherbedarf ist nicht festgelegt, aber denkbar ist 1 Byte.
  - Wertebereich: true, false
  - Kann den Zustand "ein" oder "aus", "wahr" oder "falsch", "aktiviert" oder "deaktiviert" etc. abbilden.
  - Hinweis: Das Ergebnis von Vergleichen wie `a > b` oder `a == b` ist immer ein Boolean.
  - Wahrheitswerte lassen sich logisch mit anderen Wahrheitswerten verrechnen. Beispiel: `a && b` (Und) oder `a || b` (Oder), `!a` (Negation)
- **Gleitkommazahl/Fließkommazahl (float, double)**: Repräsentieren Zahlen mit Nachkommastellen. Verwenden intern das Binärsystem und können Rundungsfehler enthalten.
  - Wertebereich von `float`: +/- 1.4E-45 (1.4 mal 10 hoch -45) bis ca. +/- 3.4E38
  - Wertebereich von `double`: +/- 4.9E-324 bis ca. +/- 1.79E308
  - Obwohl die Wertebereiche sehr groß sind, lassen sich viele Werte im Bereich nicht exakt darstellen. Es gibt also viele "Lücken" auf dem Zahlenstrahl.
  - Achtung: Es gibt viele Dezimalzahlen wie z.B. 0.1, die nicht exakt mit einem float bzw. double darstellbar sind. Der Grund ist, dass float und double Zahlen im Binärsystem kodieren und nur eine begrenzte Anzahl an Bits zur Verfügung steht.
  - Float und Double unterstützen die gängigen mathematischen Operationen wie +, -, * und /.
  - Man verwendet sie, wenn man Nachkommastellen speichern muss oder sehr große ganze Zahlen verarbeiten will.

Empfehlung für Programmieranfänger:

- Verwende für ganze Zahlen den `int`.
- Verwende für Gleitkommazahlen den `double`.
- Verwende für Text den `String`.
- Verwende für "an/aus" den `boolean`.

Weitere Datentypen sind zum Beispiel `byte`, `short` und `long`. Diese Datentypen speichern ganze Zahlen mit jeweils 8 Bits, 16 Bits und 64 Bits.