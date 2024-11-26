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

}