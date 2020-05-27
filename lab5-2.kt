fun whydoitdothis(x: Int){
    return when {
        x<=20 && x>=0 -> {
            print("Family")
        }
        x<=100 && x>=60 -> {
            print("Senior")
        }
        else -> print("Normal")
    }
}

fun main(){
    println("Enter a number!")
    var x = readLine().toString().toInt()
    whydoitdothis(x)
}