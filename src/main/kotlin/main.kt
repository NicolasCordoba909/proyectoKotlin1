fun main(args: Array<String>) {
    var contadorNumerico = 10
    while (contadorNumerico > 0){
        println("el valor de contador es $contadorNumerico")
        contadorNumerico--
    }
    do {
        val numeroAleatorio = (1..100).random()
        println ("el numero generado es $numeroAleatorio")
    } while (numeroAleatorio > 50)
}