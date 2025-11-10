import com.faangx.ktp.basics.FactorCalculatorMiniApp

fun printFactorsOf(num: Int) {
    for (i in 1..num){
        if (num % i == 0){
            print("$i, ")
        }
    }
}

fun isPrime(num: Int): Boolean {
    var cofactors = 0
    for (i in 1..num) {
        if (num % i == 0) {
            cofactors += 1
        }
    }
    return cofactors==2
}



fun main() {
    FactorCalculatorMiniApp(::printFactorsOf, ::isPrime)
}