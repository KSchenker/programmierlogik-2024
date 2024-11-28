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

    println("Programmende");
}