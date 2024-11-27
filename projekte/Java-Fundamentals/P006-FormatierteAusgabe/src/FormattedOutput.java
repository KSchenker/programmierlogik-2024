void main() {
    // Java stellt einige wenige Mittel bereit, um
    // Zeichenkettenliterale mit Variablenwerten zu mischen.
    int pixelWidth = 1000;
    int pixelHeight = 700;
    String output = "Ein Bild mit Größe (%d, %d).";
    // Die Funktion String.format ersetzt Platzhalter in
    // einer Zeichenkette mit konkreten Werten.
    println(String.format(output, pixelWidth, pixelHeight));

    // Der Platzhalter %d wird für ganze Zahlen verwendet.
    // Er wird durch eine Dezimalzahl ersetzt.
    output = "Das Bild hat %d Pixel in der Breite. ";
    output = output + " Es hat %d Pixel in der Höhe";
    println(String.format(output, pixelWidth, pixelHeight));

    // Der Platzhalter %X wird durch eine ganze Zahl ersetzt.
    // Die Ausgabe erfolgt als Hexadezimalzahl.
    println(String.format("Breite: %X Pixel", pixelWidth));
    // Eine alternative Art und Weise, um String.format zu verwenden.
    println("Ein Bild mit Breite %d Pixeln".formatted(pixelWidth));

    // Übersicht über Platzhalter
    println("Zeichen: %c".formatted('W'));
    println("Dezimalzahl: %d".formatted(100_000));
    println("Hexadezimalzahl: %x".formatted(100_000));
    println("Fließkommazahl: %f".formatted(2.35));
    println("Fließkommazahl: %.3f".formatted(2.35)); // 3 Nachkommastellen verwenden (eventuell runden)
    println("Fließkommazahl: %.2f".formatted(Math.PI));
    println("Fließkommazahl: %.4f".formatted(Math.PI));
    println("Fließkommazahl: %f".formatted(Math.PI)); // Standardmäßig werden 6 Nachkommastellen ausgegeben.
    println("Zeichenkette: %s".formatted("Java 23"));
    println("Boolean: %b".formatted(true));

    // Den Platzhalter mit Zusatzinformationen anreichern.
    println("Ganze Zahl mit mindestens 3 Stellen: %3d".formatted(1)); // rechtsbündige Ausgabe
    println("Ganze Zahl mit mindestens 3 Stellen: %3d".formatted(12));
    println("Ganze Zahl mit mindestens 3 Stellen: %3d".formatted(123));
    println("Ganze Zahl mit mindestens 3 Stellen: %3d".formatted(1234));
    println("Ganze Zahl mit mindestens 3 Stellen: %03d".formatted(1)); // rechtsbündige Ausgabe
    println("Ganze Zahl mit mindestens 3 Stellen: %03d".formatted(12));
    println("Ganze Zahl mit mindestens 3 Stellen: %03d".formatted(123));
    println("Ganze Zahl mit mindestens 3 Stellen: %03d".formatted(1234));
    println("Ganze Zahl mit mindestens 3 Stellen: %-3d".formatted(1)); // linksbündige Ausgabe
    println("Zeichenkette: %15s %s".formatted("Mustermann", "Max"));
    println("Zeichenkette: %15s %s".formatted("Werner", "Hans"));
    println("Zeichenkette: %15s %s".formatted("Ross", "Bob"));
    println("Zeichenkette: %-15s %s".formatted("Mustermann", "Max"));
    println("Zeichenkette: %-15s %s".formatted("Werner", "Hans"));
    println("Zeichenkette: %-15s %s".formatted("Ross", "Bob"));
    // Das + wird durch das Vorzeichen ersetzt. Die 0 dient als "Auffüllzeichen".
    println("Fließkommazahl: %+015.3f".formatted(-123.4567)); // mind. 15 Zeichen, 3 davon als Nachkommastellen


}