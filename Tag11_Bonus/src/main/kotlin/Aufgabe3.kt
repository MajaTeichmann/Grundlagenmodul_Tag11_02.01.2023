fun main() {
println(calculator())
}

fun calculator(){
    println("Nenne mir den Wert von Zahl 1!")
    var zahl1 = readln().toDouble()
    println("Nenne mir den Wert von Zahl 2!")
    var zahl2 = readln().toDouble()
    var ergebnis = zahl1 + zahl2
    println(ergebnis)
}