// TODO: Ein Freund hat eine Entdeckung gemacht. Er hat rausgefunden, wie man den Flächeninhalt eines Quadrats berechnet.
//  Die Formel ist a*b. Mit dieser Formel kann man auch den Inhalt eines rechtwinkligen Dreiecks berechnen,
//  indem man das ganze durch 2 teilt.
//  Implementiere die Berechnung für ein rechtwinkliges Dreieck in einer Funktion.
//  Am Ende dieser Funktion soll das Ergebnis mit println() ausgegeben werden.
//  Überlege dir auch einen passenden (englischen) Namen. Die Seiten des Quadrats sollen hier 4 cm Länge haben.

fun main(){
    println(surfaceArea()) // engl. für Flächeninhalt
}

fun surfaceArea(){
    val sideOfSquareA = 4
    val sideOfSquareB = 4
    val square = sideOfSquareA*sideOfSquareB
    println("Der Flächeninhalt unseres Quadrats beträgt ${square} cm^2!")
    val triangle = square/2 // bzw. square*0.5
    println("Der Flächeninhalt unseres rechtwinkligen Dreiecks beträgt ${triangle} cm^2!")
}

