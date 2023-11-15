import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringBuilder sb = new StringBuilder();
            int num = Integer.parseInt(br.readLine());
            sb.append(num + " = 1 ");
            int result = 0;
            if (num != -1){
                for (int i = 1; i < num; i++){
                    if (num % i == 0){
                        if (i != 1)sb.append("+ " + i + " ");
                        result += i;
                    }
                }
                if (result == num){
                    System.out.println(sb);
                    sb.setLength(0);
                }else{
                    System.out.println(num + " is NOT perfect.");
                    sb.setLength(0);
                }
            }else{
                break;
            }
        }
    }
}