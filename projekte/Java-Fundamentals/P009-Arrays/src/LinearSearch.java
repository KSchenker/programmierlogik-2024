void main() {

    String[] names = {
      "alice", "bob", "charlie", "damian", "elon", "fred"
    };

    // Aufgabe: Finde die Position, an der das in Variable
    // search gespeicherte Element im Array names vorkommt.
    // Nutze dafür eine for-Schleife.
    // Falls das ELement nicht existiert, soll das Ergebnis der
    // Wert -1 sein.
    String search = "Gerald";
    int position = -1;
    for (int i = 0; i < names.length; i = i + 1) {
        if (names[i].equalsIgnoreCase(search)) {
            position = i;
            // Wenn wir das gesuchte Wort gefunden haben, können wir die Schleife
            // vorzeitig verlassen. Die restlichen Worte in der Liste müssen wir uns nicht
            // mehr anschauen.
            break;
        }
    }
    if (position >= 0) {
        println("Das gesuchte Wort %s befindet sich an Stelle %d".
                formatted(search, position));
    } else {
        println("Das gesuchte Wort %s wurde nicht gefunden!".formatted(search));
    }


}