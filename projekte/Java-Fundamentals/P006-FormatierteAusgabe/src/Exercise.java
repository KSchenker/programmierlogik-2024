void main() {
    // Aufgabe: Ein Kunde K kauft eine Ware W im Wert von P.
    // Gib einen formatierten Text aus, der folgendes Format hat:
    // "Kunde K kauft Ware W für den Preis P (P Netto)"
    // Der Preis soll mit mindestens 5 Stellen ausgegeben werden.
    // Zwei Stellen sollen für die Nachkommastellen benutzt werden.
    // Der Preis soll sowohl als Nettopreis als auch als Bruttopreis
    // ausgegeben werden. Bruttopreis = 119% des Nettopreises
    double netAmount = 100; // Nettopreis
    double taxInPercent = 19; // Mehrwertsteuersatz
    double grossAmount = netAmount * (100.0 + taxInPercent) / 100; // Bruttopreis
    String customer = "John Doe"; // Kundenname
    String product = "Mechanical Keyboard"; // Ware / Produkt

    println("Kunde %s kauft %s für den Bruttopreis %5.2f (%.2f Netto)".formatted(
            customer, product, grossAmount, netAmount
    ));

}