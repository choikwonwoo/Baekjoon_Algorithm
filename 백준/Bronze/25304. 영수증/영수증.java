import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int result =0;
        for (int i = 1; i <= n; i++){
            int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            result += list[0] * list[1];
        }
        System.out.println((result==total)? "Yes" : "No");
    }
}