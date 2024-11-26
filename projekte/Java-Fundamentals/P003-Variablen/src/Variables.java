void main() {
    // Eine Variable ist ein Bezeichner für einen
    // reservierten Bereich im Speicher. Variablen
    // erlauben es dem Entwickler, Speicher mit einem
    // Namen anzusprechen und nicht mit konkreten
    // Speicheradressen.
    // In Java sind wir dazu verpflichtet, der Variablen
    // einen festen Datentyp zuzuordnen.
    // Syntax für Variablenerstellung:
    // <Datentyp> <Variablenname> = <Startwert>;
    int age = 20;
    age = 30; // Neuen Wert an Variable age zuweisen / überschreiben.
    // age = "ein text"; // Fehler: age kann keinen String speichern, nur ints!
    age = age + 10; // Achtung: = bedeutet "zuweisen". Das ist keine Gleichung!
    println(age); // 40
    age = age + 10;
    println(age); // 50

    String name = "Max Mustermann";
    name = "Alice Wonderland";
    name = "Bob" + " Ross"; // Aneinanderhängen von zwei Zeichenketten.
    String firstName = "John";
    String lastName = "Doe";
    String displayName = firstName + " " + lastName;
    println(displayName); // "John Doe"
    String formalName = lastName + ", " + firstName;
    println(formalName);
    // println(firstName * 3); // Typfehler: String und int nicht multiplizierbar.
    // println("abc" - "123"); // Typfehler: Zwei Strings subtrahieren ist nicht möglich.

    age = 123; // Eine Zahl!
    String text = "123"; // Keine Zahl! Ein Text bestehend aus den Zeichen '1', '2', '3'

    float percentage = 0.56f; // Das Suffix f sagt dem Compiler, dass wir 0.56 als float präsentieren.
    // Ohne Suffix f würde 0.56 als double präsentiert. Das erzeugt jedoch einen Typfehler, denn ein
    // Double-Wert kann nicht in einer float-Variablen gespeichert werden. (Informationsverlust wäre möglich)

    double taxRate = 2.5678;
    double veryBigNumber = 2.34E50; // Wissenschaftliche Notation (2.34 mal 10 hoch 50)
    double verySmallNumber = 2.34E-50; // 2.34 mal 10 hoch -50

    char letter = 'a';

    boolean isReady = false;
    boolean isDone = true;
}