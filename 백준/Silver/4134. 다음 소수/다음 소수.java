import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            Long num = Long.parseLong(br.readLine());
            while (true){
                Boolean flag = true;
                for(long k = 2; k <= (long) Math.sqrt(num); k++){
                    if (num % k == 0){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    sb.append(num < 2  ? 2 + "\n" : num + "\n");
                    break;
                }
                num++;
            }
        }
        System.out.println(sb);
    }
}