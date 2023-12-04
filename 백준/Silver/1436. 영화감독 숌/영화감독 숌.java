import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 666; i < 3000000; i++){
            String str = String.valueOf(i);
            if (str.contains("666")) count++;
            if (n == count){
                sb.append(i);
                break;
            }
        }
        System.out.println(sb);
    }
}