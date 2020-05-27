import java.io.File

fun readFileAsLinesUsingBufferedReader(fileName: String): List<String>
        = File(fileName).bufferedReader().readLines()
fun main(){
    val Declaration_of_Independance = "src/Declaration_of_Independance.txt"
    val content = readFileAsLinesUsingBufferedReader(Declaration_of_Independance)
    println(content)
}