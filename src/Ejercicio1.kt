/**
 * Crear un programa en Kotlin que declare diferentes tipos de
 * variables (Int, Float, Double, String, Boolean) y realice operaciones básicas
 * con ellas, como sumas, concatenación y comparaciones.
 * */
fun main() {
    val numeroEntero: Int = 3
    val numeroFlotante: Float = 5f
    val numeroDoble: Double = 4.0
    val cadena: String = "Hola"
    val valor: Boolean = false


    // suma de 2 numeros
    val suma1 = numeroEntero + numeroFlotante
    val suma2 = numeroEntero + numeroDoble
    val suma3 = numeroFlotante + numeroDoble
    println("$numeroEntero mas $numeroFlotante es igual a: $suma1")
    println("$numeroEntero mas $numeroDoble es igual a: $suma2")
    println("$numeroFlotante mas $numeroDoble es igual a: $suma3\n")

    //concatenacion
    val concatenado = "$cadena $valor"
    println("concatenado = $concatenado\n")

    //comparaciones
    val comparacion1 = numeroEntero > numeroFlotante
    val comparacion2 = numeroFlotante < numeroDoble
    val comparacion3 = numeroDoble > numeroEntero
    println("$numeroEntero es mayor que $numeroFlotante? = $comparacion1")
    println("$numeroFlotante es menor que $numeroDoble? = $comparacion2")
    println("$numeroDoble es mayor que $numeroEntero? = $comparacion3")
}