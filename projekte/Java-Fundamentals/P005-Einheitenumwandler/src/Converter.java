void main() {
    // Aufgabe: Ein Benutzer möchte wissen, wie viele
    // Bytes, KiB, KB, MiB, MB seine Festplatte zur Verfügung stellt.
    // Er möchte die Festplattenkapazität in GiB eingeben.
    // 1) Wert von Nutzer einlesen
    // 2) Wert in double konvertieren.
    // 3) Den Wert in Bytes, KiB etc. umrechnen und auf der Console ausgeben.
    // Empfehlung: Wandle zuerst den eingegeben Wert in Bytes um.
    // Aus der Anzahl Bytes lässt sich dann KB, KiB etc. berechnen.
    String userInput = readln("Kapazität in GiB: ");
    double gibiBytes = Double.parseDouble(userInput);
    double bytes = gibiBytes * 1024 * 1024 * 1024;
    double kiloBytes = bytes / 1000;
    double kibiBytes = bytes / 1024;
    double megaBytes = kiloBytes / 1000;
    double mibiBytes = kibiBytes / 1024;
    double gigaBytes = megaBytes / 1000;
    println(gibiBytes + " GiB entsprechen:");
    println(bytes + " B");
    println(kiloBytes + " KB");
    println(kibiBytes + " KiB");
    println(megaBytes + " MB");
    println(mibiBytes + " MiB");
    println(gigaBytes + " GB");

    // Aufgabe: Ein Bild besteht aus 700 Pixeln in der Breite und 1300 Pixeln in der Höhe.
    // Jeder Pixel wird mit 3 Bytes gespeichert. Berechnen Sie die Gesamtmenge an Bytes,
    // die zur Speicherung des Bildes notwendig ist.
    // Wie lange würde die Übertragung des Bildes dauern, wenn 64 KiB/sec übertragen werden
    // können?
    // Schreibe das Programm so, dass die Werte einfach ausgetauscht werden können.
    int pixelWidth = 700;
    int pixelHeight = 1300;
    int bytesPerPixel = 3;
    int totalBytes = pixelWidth * pixelHeight * bytesPerPixel;
    double bytesPerSecond = 64 * 1024;
    double durationInSeconds = totalBytes / bytesPerSecond;
    println("Ein Bild mit Größe (" + pixelWidth + ", " + pixelHeight + ") und " +
            bytesPerPixel + " Bytes pro Pixel benötigt insgesamt " + totalBytes + " Bytes");
    println("Bei einer Übertragungsrate von " + bytesPerSecond + " Bytes/sec dauert die " +
            "Übertragung " + durationInSeconds + " Sekunden!");



}