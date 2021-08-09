fun main() {
    println("Bem Vindo ao ByteBank!")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.00
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta ")
    deposita(contaAlex,50.0)
    println(contaAlex.saldo)
    deposita(contaFran, 70.0)


    }

class Conta{
    var titular = ""
    var numero = 0
    var saldo = 0.0
}
fun deposita(conta: Conta, valor: Double){
    conta.saldo += valor
}



fun testaLacos(){
    //    for (i in 5 downTo 1 step 2) {
//        var titular = "Alex $i"
//        val numeroConta = 1000 + i
//        var saldo = i + 10.0
//
//        println("Titular: $titular")
//        println("Numero da Conta: $numeroConta")
//        println("Saldo da conta: $saldo")

    var i = 0
    while (i<=5){
        var titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Numero da Conta: $numeroConta")
        println("Saldo da conta: $saldo")
        i++
    }

}



fun testaCondicoes(saldo: Double) {

    //    if (saldo > 0.0) {
//        println("Conta é posistiva")
//    }
//    else if (saldo == 0.0) {
//        println("Conta é neutra")
//    }
//    else {
//        println("Conta negativa")
//    }

    when {
        saldo > 0.0 -> {
            println("Conta é posistiva")
        }
        saldo == 0.0 -> {
            println("Conta é neutra")
        }
        else -> {
            println("Conta negativa")
        }
    }

}

