import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
//    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()
    val n = br.readLine().toInt()
    var i = 1
    var flag = true
    val st = Stack<Int>()

    for (s in 0..<n){
        val num = br.readLine().toInt()
        if (i <= num){
            while (i <= num){
                st.push(i)
                sb.append("+\n")
                i++
            }
            st.pop()
            sb.append("-\n")
        }else {
            val op = st.pop()
            if(op>num){
                print("NO")
                flag =false
                break
            }else{
                sb.append("-\n")
            }
        }
    }
    if (flag){
//        bw.flush()
//        bw.close()
        println(sb)
    }
}