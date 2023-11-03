import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] n = Arrays.stream(br.readLine().split( " ")).mapToInt(Integer::parseInt).toArray();
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if( num < n[1]){
                sb.append(num + " ");
            }
        }
        System.out.println(sb);
    }
}