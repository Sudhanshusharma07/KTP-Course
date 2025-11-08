import com.faangx.ktp.basics.MultiplicationTableMiniApp

fun printTable(num: Int) {
for (it in 10..50){
    println("$num*${it}=${num*(it)}")
}
}

fun main() {
    MultiplicationTableMiniApp(::printTable)
}