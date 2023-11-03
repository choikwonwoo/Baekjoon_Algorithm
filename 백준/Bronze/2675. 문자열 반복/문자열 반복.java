import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            String[] q = br.readLine().split(" ");
            int repeat = Integer.parseInt(q[0]);
            for (int j = 0; j < q[1].length(); j++){
                for (int k = 0; k < repeat; k++) {
                    sb.append(q[1].charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}