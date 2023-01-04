fun main() {
println(kuehlschrank())
}

fun kuehlschrank(){
    var inhalt = listOf<String>("Eier","Käse","Wurst","Apfelsaft","Milch","Brot","Butter","Marmelade")
    println("Nach welchem Lebensmittel suchst du?")
    var gesuchtesLebensmittel = readln()
    println(inhalt.contains(gesuchtesLebensmittel))
}