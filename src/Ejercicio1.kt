/**
 * Crear un programa en Kotlin que declare diferentes tipos de
 * variables (Int, Float, Double, String, Boolean) y realice operaciones básicas
 * con ellas, como sumas, concatenación y comparaciones.
 * */
fun main() {
    var numeroEntero: Int = 3
    var numeroFlotante: Float = 5f
    var numeroDoble: Double = 4.0
    var cadena: String = "Hola"
    var valor: Boolean = false


    // suma de 2 numeros
    var suma1 = numeroEntero + numeroFlotante
    var suma2 = numeroEntero + numeroDoble
    var suma3 = numeroFlotante + numeroDoble
    println("$numeroEntero mas $numeroFlotante es igual a: $suma1")
    println("$numeroEntero mas $numeroDoble es igual a: $suma2")
    println("$numeroFlotante mas $numeroDoble es igual a: $suma3\n")

    //concatenacion
    var concatenado = "$cadena $valor"
    println("concatenado = $concatenado\n")

    //comparaciones
    var comparacion1 = numeroEntero > numeroFlotante
    var comparacion2 = numeroFlotante < numeroDoble
    var comparacion3 = numeroDoble > numeroEntero
    println("$numeroEntero es mayor $numeroFlotante? = $comparacion1")
    println("$numeroFlotante es menor que $numeroDoble? = $comparacion2")
    println("$numeroDoble es mayor que $numeroEntero? = ${comparacion3}")
}