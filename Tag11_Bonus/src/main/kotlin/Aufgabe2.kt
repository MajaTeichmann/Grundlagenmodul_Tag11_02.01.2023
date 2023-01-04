
fun main(){
    println(dice())
}

fun dice(){
    println("Wie viele Seiten soll dein Würfel haben?")
    var wuerfelSeiten = readln().toInt()
    val kleinstMoeglicheZahl = 1
    var groesstMoeglicheZahl = wuerfelSeiten
    var dice = kleinstMoeglicheZahl..wuerfelSeiten
    println("Es wurde 10x mit deinem ${wuerfelSeiten}-Seitigen Würfel gewürfelt und folgende Zahlen haben sich ergeben:")
    println(" [1] ${dice.random()}")
    println(" [2] ${dice.random()}")
    println(" [3] ${dice.random()}")
    println(" [4] ${dice.random()}")
    println(" [5] ${dice.random()}")
    println(" [6] ${dice.random()}")
    println(" [7] ${dice.random()}")
    println(" [8] ${dice.random()}")
    println(" [9] ${dice.random()}")
    println(" [10] ${dice.random()}")

}
