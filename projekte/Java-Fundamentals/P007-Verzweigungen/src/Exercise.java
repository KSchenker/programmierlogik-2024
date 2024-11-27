void main() {

    // Aufgabe: Ein Nutzer soll sein Alter eingeben.
    // Wenn er mindestens 18 Jahre alt ist, soll "volljährig"
    // ausgegeben werden, andernfalls "minderjährig".
    // Wenn der Nutzer mindestens 70 Jahre alt ist, soll
    // zusätzlich "Rentner" ausgegeben werden.
    // Integer.parseInt wandelt String in int um.
    // Größer gleich: >=
    // Kleiner gleich: <=
    // Gleich: ==
    // Ungleich: !=
    String userInput = readln("Gib Alter ein: ");
    int age = Integer.parseInt(userInput);

    if (age < 18) {
        println("Minderjährig");
    } else {
        // Ist age < 18 false, dann muss age >= 18 sein.
        println("Volljährig");
    }

    if (age >= 70) {
        println("Renter");
    }


}