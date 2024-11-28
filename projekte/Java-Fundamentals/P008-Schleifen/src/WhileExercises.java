void main() {

    // Erstelle mit Hilfe einer while-Schleife folgende
    // Zahlenmuster
    // 1)  1, 2, 3, 4, 5
    // 2)  5, 4, 3, 2, 1
    // 3)  1, 3, 5, 7, 9
    // 4) -1, 3, -5, 7, -9

    int i = 1;
    while (i <= 5) {
        print(i + ", ");
        i = i + 1;
    }
    println("");

    i = 5;
    while (i >= 1) {
        print(i + ", ");
        i = i - 1;
    }
    println("");

    i = 1;
    while (i <= 9) {
        print(i + ", ");
        i = i + 2;
    }
    println("");

    i = 1;
    int sign = -1;
    while (i <= 9) {
        print(i * sign + ", ");
        sign = -sign; // Wechsel von -1 -> 1 bzw 1 -> -1
        i = i + 2;
    }
    println("");

    // Aufgabe: Erstelle folgendes Muster
    // (10, 1), (9, 2), (8, 3), ..., (1, 10)
    // Verwende die formatted-Methode für die Ausgabe.
    int a = 10;
    int b = 1;
    while (b <= 10) {
        print("(%d, %d)".formatted(a, b));
        a = a - 1;
        b = b + 1;
        // Gibt ein Komma aus, wenn es sich noch nicht
        // um das letzte Zahlenpaar handelt.
        if (b <= 10) {
            print(", ");
        }
    }
    println("");

    // Aufgabe: Erstelle folgendes Muster:
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    // Tipp: Verwende eine while-Schleife innerhalb einer
    // while-Schleife.
    int upperBound = 1;
    while (upperBound <= 10) {
        int number = 1;
        while (number <= upperBound) {
            print("%d ".formatted(number));
            number = number + 1;
        }
        println("");
        upperBound = upperBound + 1;
    }

    // Aufgabe: Gib eine Multiplikationstabelle auf dem
    // Terminal aus. Beginne bei 1 und höre bei 10 auf.
    // Gib jede Zahl mit 3 Stellen aus (rechtsbündig).
    // Tipp: Verwende zwei ineinander geschachtelte Schleifen.
    a = 1;
    while (a <= 10) {
        b = 1;
        while (b <= 10) {
            int product = a * b;
            print("%4d".formatted(product));
            b = b + 1;
        }
        println("");
        a = a + 1;
    }

    println("Programmende");
}