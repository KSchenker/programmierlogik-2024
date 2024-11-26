void main() {
    // Erstelle Variable input vom Typ String. Der Startwert für input
    // ist das Ergebnis des Funktionsaufrufs readln.
    String input = readln("Temperatur in °C: ");
    // Problem: Mit einem String können wir keine Berechnungen durchführen.
    // Wir müssen also den String in eine Gleitkommazahl umwandeln (konvertieren).
    // Die vordefinerte Funktion Double.parseDouble wandelt eine Zeichenkette
    // in einen double-Wert um.
    // Hinweis: parseDouble erwartet einen Punkt als Dezimaltrenner, nicht das
    // Komma!
    double celsius = Double.parseDouble(input);
    double fahrenheit = celsius * 9 / 5 + 32;
    println(celsius + " °C entsprechen " + fahrenheit + " °F");
}