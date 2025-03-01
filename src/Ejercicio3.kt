fun main() {

    var numero: Int?

    print("Ingresa un numero: ")
    var input: String
    do {
        input = readln()
    } while (!validarNumero(input))

    var contador = 1
    numero = input.toInt()
    println("\nLista generada desde 1 hasta $numero:")
    while (contador <= numero) {
        println(contador)
        contador++
    }
}

fun validarNumero(numero: String): Boolean {
    val valor: Int;
    try {
        valor = numero.toInt()
        if (valor <= 0) {
            println("Entrada invalida. Ingrese un numero mayor que 0")
            return false
        }
        return true
    } catch (e: NumberFormatException) {
        println("Entrada invalida. Ingresa un numero entero valido")
        return false
    }
}