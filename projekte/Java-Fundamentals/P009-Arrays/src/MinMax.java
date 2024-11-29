void main() {

    double[] grades = {2.2, 1.3, 5.2, 1.1, 4.1, 2.0};

    // Anfänglich gehen wir davon aus, dass die erste Note
    // die beste Note ist. Wir schauen uns dann alle weiteren
    // Noten an und korrigieren ggf. unsere Annahme.
    double min = grades[0];
    double max = grades[0];
    for (int i = 1; i < grades.length; i = i + 1) {
        // Haben wir eine bessere Note gefunden?
        // Falls ja, speichern wir sie in Variable min.
        if (grades[i] < min) {
            min = grades[i];
        }
        if (grades[i] > max) {
            max = grades[i];
        }
    }
    println("Die beste Note ist %.1f und die schlechteste ist %.1f"
            .formatted(min, max));

    // Aufgabe: Verändere den obigen Code um zusätzlich auch
    // die schlechteste Note zu ermitteln.

}