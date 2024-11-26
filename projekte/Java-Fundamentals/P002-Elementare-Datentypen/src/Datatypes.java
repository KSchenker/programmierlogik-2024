void main() {
    // Mit dem Datentyp int stellen wir ganze Zahlen dar.
    // int ist eine Abkürzung für Integer. Ein int verwendet 32 Bits.
    println(123); // Das Literal 123 hat den Datentyp int. (Dezimalzahl)
    println(0x7b); // Ganze Zahlen lassen sich auch im Hexadezimalsystem angeben.
    println(0b0111_1011); // Auch Binärzahlen dürfen angegeben werden.
    println(0173); // Auch Oktalzahlen werden unterstützt. Sie verwenden die Basis 8.
    println(-20);
    println(2 + 3 * 7 + 100); // int-Werte lassen sich miteinander verrechnen.
    println(Integer.MAX_VALUE); // 2147483647
    // int ist ein vorzeichenbehafteter Datentyp. Die Bits im Speicher werden
    // im Zweierkomplement "interpretiert".
    println(Integer.MAX_VALUE + 1); // Überlauf (-2147483648)
    println(-2147483648 - 1); // Unterlauf (2147483647)

    println(true); // Dieser Wert hat den Datentyp boolean.
    println(false); // Dieser Wert hat den Datentyp boolean.

    // Die Zeichenketten in Java unterstützen den Unicode-Zeichensatz.
    // Intern speichert Java jedes Zeichen mit 2 Bytes ab. Java verwendet intern
    // die Zeichenkodierung UTF-16.
    println("2 + 3 * 7 + 100"); // Zeichenketten haben den Datentyp String.
    println('c'); // Dieser Wert hat den Datentyp char (Character / Zeichen).
    // Wenn man ein Zeichen nicht per Tastatur eingeben kann, kann man stattdessen
    // seinen Kodierungswert ("Unicode-CodePoint") eingeben. Zum Beispiel
    // hat das Zeichen ":" den Kodierungswert 0x003A.
    println('\u003A'); // Dieser Wert hat den Datentyp char (Character / Zeichen).


    // Gleitkommazahlen werden in Java mit 32 Bits (floats) oder 64 Bits (doubles)
    // kodiert.
    // Achtung: Es gibt viele Dezimalzahlen, die sich nicht exakt auf der Hardware
    // speichern lassen, z.B. die Dezimalzahl 0,1. Hier entstehen Rundungsfehler!
    println(2.2 + 1.1); // Achtung: Hier kommt nicht exakt 0.3 heraus!!!
    // Die Werte / Literale 2.2 und 1.1 haben jeweils den Datentyp double. Ein
    // double kann ungefähr 15 signifikante Stellen exakt darstellen, danach treten
    // jedoch Rundungsfehler auf.
    println(Math.PI); // PI als double
    // Der Datentyp float kann nur etwa 8 bis 9 signifikante Stellen exakt darstellen.
    println((float)Math.PI); // PI als float (weniger Präzision)



}