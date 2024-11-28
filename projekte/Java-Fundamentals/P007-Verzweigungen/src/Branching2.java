void main() {

    double netto = 100;
    double tax = 19; // Mehrwertsteuer
    double brutto;

    // Allgemeine Syntax:
    // if (BedingungA) {
    //   Anweisungen
    // } else if (BedingungB) {
    //   Anweisungen
    // } else {
    //   Anweisungen
    // }
    // "else if" und "else" sind optional.

    String userInput = readln("Ist das Tiernahrung (j/n): ");
    if (userInput.equals("j")) {
        tax = 7;
        println("Für Tiernahrung gilt 7%");
    } else if (userInput.equals("n")) {
        tax = 19;
        println("Es gilt die Standardmehrwertsteuer 19%");
    } else {
        println("Falsche Eingabe. j oder n erwartet!");
        return; // Beende das Programm
    }
    brutto = netto * (100 + tax) / 100;
    println("Bruttopreis ist %.2f".formatted(brutto));
}