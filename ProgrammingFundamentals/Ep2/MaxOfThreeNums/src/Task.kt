import com.faangx.ktp.basics.MaxOfThreeNumsMiniApp

fun maxOf(x: Int, y: Int, z: Int): Int {
    if (x>y && x>z){
        return x
    }
    else if (y>z && y>x){
        return y
    }
    else{
        return z
    }
}

fun main() {
    MaxOfThreeNumsMiniApp(::maxOf)
}