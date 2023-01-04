fun main() {
println(flaeche())
}

fun flaeche(){
    println("Wir wollen die Fläche eines Rechtecks berechnen.")
    var seiteA = 2
    var seiteB = 3
    println("Seite A hat die Länge von ${seiteA}cm und Seite B die Länge von ${seiteB}cm.")
    var rechteck = seiteA*seiteB
    println("Es ergibt sich eine Fläche von ${rechteck}cm^2!")
}