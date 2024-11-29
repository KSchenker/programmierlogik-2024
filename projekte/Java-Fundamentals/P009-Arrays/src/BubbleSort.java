void main() {

    //    [5 1] 4 9 0 8 6
    // 1) 1 [5 4] 9 0 8 6
    // 2) 1 4 [5 9] 0 8 6
    // 3) 1 4 5 [9 0] 8 6
    // 4) 1 4 5 0 [9 8] 6
    // 5) 1 4 5 0 8 [9 6]
    // 6) 1 4 5 0 8 6 |9
    //
    //    [1 4] 5 0 8 6 9
    // 7) 1 [4 5] 0 8 6 9
    // 8) 1 4 [5 0] 8 6 9
    // 9) 1 4 0 [5 8] 6 9
    //10) 1 4 0 5 [8 6] 9
    //11) 1 4 0 5 6 | 8 9
    //12) ...

    // Die Idee von BubbleSort ist es, die Maximas
    // nach "hinten" zu verschieben. Das geschieht
    // durch kontinuierliches Vergleichen und Vertauschen.
    // Hinweis: durchlauf++ bedeutet "durchlauf = durchlauf + 1"
    int[] zahlen = {5, 1, 4, -2, 9, 0, 8, 6};
    for (int durchlauf = 1; durchlauf < zahlen.length; durchlauf++) {
        // Im 1. Durchlauf müssen wir bis zum vorletzten Element
        // laufen, im zweiten Durchlauf nur noch bis zum vorvorletzten
        // Element usw.
        for (int index = 0; index < zahlen.length - durchlauf ; index++) {
            int aktuellesElement = zahlen[index];
            int nachfolger = zahlen[index + 1];
            if (aktuellesElement > nachfolger) {
                // Tausche dieses Element mit dem Nachfolger.
                zahlen[index] = nachfolger;
                zahlen[index + 1] = aktuellesElement;
            }
        }
    }
    // Ausgabe des sortierten Arrays.
    for (int i = 0; i < zahlen.length; i++) {
        print(zahlen[i] + " ");
    }
}