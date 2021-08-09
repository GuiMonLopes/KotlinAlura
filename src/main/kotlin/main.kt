fun main() {


    println("Bem Vindo ao ByteBank!")

    for (i in 1..5) {
        var titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Numero da Conta: $numeroConta")
        println("Saldo da conta: $saldo")

//    testaCondicoes(saldo)

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