void main() {

//    for (initialisierung; bedingung; iterationsanweisung) {
//        // Schleifenanweisungen
//    }

    for (int i = 1; i <= 10; i = i + 1) {
        print(i + " ");
    }
    println("");

    for (int i = 10; i >= 1; i = i - 1) {
        print(i + " ");
    }
    println("");

    for (int a = 10, b = 1; b <= 10; a = a - 1, b = b + 1) {
        print("(%d, %d) ".formatted(a, b));
    }
    println("");

    int a = 10;
    int b = 1;
    for (; b <= 10; ) {
        print("(%d, %d) ".formatted(a, b));
        a = a - 1;
        b = b + 1;
    }

}