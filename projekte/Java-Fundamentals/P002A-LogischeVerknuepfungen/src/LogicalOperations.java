void main() {

    boolean isActive = true;

    // Logische Negation
    println(isActive); // true
    println(!isActive); // true -> false
    println(!!isActive); // true -> false -> true
    isActive = !isActive; // Wechseln (switch / toggle)
    println(isActive); // false

    // Logische Und-Verknüpfung
    boolean isAdmin = true;
    isActive = true;
    boolean accessGranted = isActive && isAdmin;
    println(accessGranted); // true
    isActive = false;
    accessGranted = isActive && isAdmin;
    println(accessGranted); // false

    // Logische Oder-Verknüpfung (KEIN Entweder-Oder!)
    boolean isCEO = true;
    // Zugriff gestatten, wenn der Nutzer ein Administrator oder
    // der Geschäftsführer ist. Der Zugriff wird natürlich gewährt,
    // wenn der Administrator der Geschäftsführer ist.
    accessGranted = isAdmin || isCEO;
    println(accessGranted);

    // Das Entweder-Oder kann man in Java durch Kombination von Oder und
    // Und-Verknüpfung nachbilden.
    // A entweder-oder B <=> A und Nicht-B ODER Nicht-A und B
    // Prüfe, ob Admin und CEO nicht ein und dieselbe Person sind.
    boolean isEitherAdminOrCEO = isAdmin && !isCEO || !isAdmin && isCEO;
    println(isEitherAdminOrCEO); // false

}