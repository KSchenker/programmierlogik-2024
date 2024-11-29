void main() {
    // Ein Array ist eine Datenstruktur, die mehrere Elemente
    // in einer Sequenz anordnet. Jedes Element hat eine feste
    // Position und kann über diese Position angesprochen werden.
    // Arrays können ihre Größe nachträglich nicht ändern.
    // Es können aber einzelne Elemente ersetzt werden.
    // <Elementdatentyp>[] name = { element1, element2  };

    String[] friends = {"Alice", "Bob", "Charlie"};
    println(friends[0]); // Elementzugriff mit Indexoperator
    println(friends[1]); // Bob
    println(friends[2]); // Charlie
    //println(friends[3]); // Fehler! Kein Element an Position 3
    friends[0] = "Anton"; // Ersetze Element "Alice" mit "Anton".
    println(friends.length); // 3 (die Anzahl der Elemente des friends-Array)
    println(friends[0]); // Anton

    double[] grades = {5.2, 2.6, 3.1, 5.2, 4.7};
    double sum = grades[0] + grades[1] + grades[2] + grades[3] + grades[4];
    double average = sum / grades.length;
    println("Notendurchschnitt: %.2f".formatted(average));

    sum = 0;
    for (int i = 0; i < grades.length; i = i + 1) {
        double aGrade = grades[i];
        sum = sum + aGrade;
    }
    average = sum / grades.length;
    println("Notendurchschnitt: %.2f".formatted(average));

    if (average < 3) {
        println("Der Notendurchschnitt übersteigt die Erwartungen.");
    } else if (average < 4) {
        println("Der Notendurchschnitt ist erwartungsgemäß");
    } else {
        println("Der Notendurchschnitt ist besorgniserregend");
    }


}