void main() {

    Random randomizer = new Random();

    while (true) {
        int usersNumber;
        int totalGuesses = 0;
        // Ermittle eine zufällige Zahl im Bereich 1 - 100.
        int randomNumber = randomizer.nextInt(1, 100 + 1);

        do {
            String userInput = readln("Gib Zahl im Bereich 1 - 100 ein: ");
            usersNumber = Integer.parseInt(userInput);
            totalGuesses = totalGuesses + 1;
            if (usersNumber < randomNumber) {
                println("Die gesuchte Zahl ist größer.");
            } else if (usersNumber > randomNumber) {
                println("Die gesuchte Zahl ist kleiner.");
            } else {
                println("Herzlichen Glückwunsch. Du hast die Zahl erraten!");
            }
        } while (usersNumber != randomNumber);

        println("Du hast %d Rateversuche benötigt.".formatted(totalGuesses));

        String userInput = readln("Möchtest du noch einmal spielen? : ");
        if (userInput.equals("n") || userInput.equals("nein")) {
            break; // Verlasse die Schleife sofort.
        }
    }

    println("Bis zum nächsten Mal!");
}