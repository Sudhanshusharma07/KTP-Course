import com.faangx.ktp.basics.GreetingMiniApp

fun greet(name: String): String {
    val x = name
    return "Namaste $name"
}

fun main() {
    GreetingMiniApp(::greet)
}