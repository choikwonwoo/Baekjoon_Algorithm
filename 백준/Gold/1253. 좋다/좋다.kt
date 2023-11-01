import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    var listArr = readLine().split(" ").map { it.toInt() }.sorted().toMutableList()
    var count = 0
    for(i in 0..<n){
        var start = 0
        var end = n-1
        while (start<end){
            if (i==start || i==end){
                if (i==start) start++
                if (i==end) end--
                continue
            }
            var sum = listArr[start] + listArr[end]
            if(sum<listArr[i]){
                start++
            }else if(sum>listArr[i]){
                end--
            }else if(sum==listArr[i]){
                count++
                break
            }
        }
    }
    print(count)
}