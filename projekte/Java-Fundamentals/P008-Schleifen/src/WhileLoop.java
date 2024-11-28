void main() {

    // Eine Schleife ist eine Kontrollstruktur mit der wir
    // Anweisungen bedingt wiederholen können.
    // Man unterscheidet zwei Arten von Schleifen:
    // Kopfgesteuerte Schleifen und fußgesteuerte Schleifen.
    // Eine kopfgesteuerte Schleife prüft vor der Ausführung
    // ihrer Anweisungen eine Bedingung. Nur wenn die Bedingung
    // erfüllt ist, werden die Anweisungen erneut ausgeführt.
    // Eine fußgesteuerte Schleife führt zuerst ihre Anweisungen aus.
    // Erst danach wird eine Bedingung geprüft. Falls diese wahr ist,
    // werden die Anweisungen erneut ausgeführt.

    String message = "Java ist toll";
    int count = 3;

    println(count);
    while (count > 0) {
        println(message);
        count = count - 1;
    }
    println(count);
    println("Programmende");

}