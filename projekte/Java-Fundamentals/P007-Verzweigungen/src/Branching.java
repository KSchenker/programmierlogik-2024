void main() {

    double netto = 100;
    double tax = 19; // Mehrwertsteuer
    double brutto;

    String userInput = readln("Ist das Tiernahrung (j/n): ");
    if (userInput.equals("j")) {
        tax = 7;
    } else {
        tax = 19;
    }
    brutto = netto * (100 + tax) / 100;
    println("Bruttopreis ist %.2f".formatted(brutto));
}