import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val n = br.readLine().toInt()
    val list = br.readLine().split(" ").map { it.toInt() }
    val stack = Stack<Int>()
    var result = arrayOfNulls<Int>(n)

    for (i in 0..<n){
        while (stack.isNotEmpty() && list[i]>list[stack.peek()]){
            result[stack.pop()] = list[i]
        }
        stack.add(i)
    }
    while (stack.isNotEmpty()){
        result[stack.pop()] = -1
    }
    for (i in 0..<n){
        sb.append("${result[i]} ")
    }
    print(sb)
}