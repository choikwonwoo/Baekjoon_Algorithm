import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int sqrt = (int)Math.sqrt(1000001);
        boolean[] arr = new boolean[1000001];
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i < arr.length; i++){
            if (!arr[i]){
                for (int k = 2*(i); k < arr.length; k += i){
                    arr[k] = true;
                }
            }
        }
        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            int count = 0;
            for (int k = 1; k <= num / 2; k++){
                if (!arr[k] && !arr[num - k]){
                    count++;
                }
            }
            sb.append(count + "\n");
        }
        System.out.println(sb);
    }
}