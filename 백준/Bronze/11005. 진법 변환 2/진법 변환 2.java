import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int num = n[0];
        int m = n[1];
        while (num>0){
            if (num % m>=10){
                sb.append( (char) (num % m + 55) );
            }else{
                sb.append( num % m );
            }
            num = num / m;
        }
        System.out.println(sb.reverse());
    }
}