import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String a = "";
        for (int i = n-1; i >= 0; i--){
            for (int j=0; j<i; j++){
                sb.append(" ");
            }
            sb.append(a+="*");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}