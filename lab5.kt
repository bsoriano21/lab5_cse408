
fun compare(x: Int, y: Int) {
    return when {
        x<y -> {
            print(1)
        }
        x>y -> {
            print(-1)
        }
        else -> print(0)
    }
}

fun main(){
    println("Enter two numbers!")
    var x = readLine().toString().toInt()
    var y = readLine().toString().toInt()
    compare(x, y)
}