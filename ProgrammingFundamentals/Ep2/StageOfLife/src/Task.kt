import com.faangx.ktp.basics.StageOfLifeMiniApp

fun stageOfLife(age: Int): String {
    return when {
        age >= 60  -> "OLd age"
        age >= 18  ->"Adult"
        age >= 12 -> "childhood"
        age >= 3 -> "Teenage"
        else -> "infancy"
    }
}

fun main() {
    StageOfLifeMiniApp(::stageOfLife)
}