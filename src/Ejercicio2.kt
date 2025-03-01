fun main() {
    val numero = 9 // numero a discriminar
    var i = numero

    // reduciendo el valor hasta encontrar el residuo
    while (i >= 2){
        i -= 2
    }

    if(i == 0) {
        println("$numero es par")
    } else {
        println("$numero es impar")
    }
}