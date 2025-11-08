import com.faangx.ktp.basics.VoteAgeCheckerMiniApp

fun canVote(age: Int): Boolean {
    if(age<18){
        return false
    }
    else{
        return true
    }
}

fun main() {
    VoteAgeCheckerMiniApp(::canVote)
}