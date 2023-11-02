import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            sb.append(list[0]+list[1]+"\n");
        }

        System.out.println(sb);
    }
}