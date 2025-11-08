import com.faangx.ktp.basics.GradeCalculatorMiniApp

fun gradeFor(m1: Int, m2: Int, m3: Int, m4: Int, m5: Int): String {
    val average = (m1 + m2 + m3 + m4 + m5) / 50f
    return when (average) {
        in 9f..10f -> "A+"
        in 8f..9f -> "B"
        in 7f..8f -> "C"
        in 6f..7f -> "D"
        in 5f..6f -> "E"
        else -> "FAIL"

    }
}







fun main() {
    GradeCalculatorMiniApp(::gradeFor)
}