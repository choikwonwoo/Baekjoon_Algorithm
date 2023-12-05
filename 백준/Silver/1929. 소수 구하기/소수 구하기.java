import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[ m - n + 1 ];

        for (int i = n; i <= m; i++){
            if (i < 2) continue;
            else arr[i-n] = i;
        }
        for (int k = 2; k <= Math.sqrt(m); k++){
            for (int i = 0; i < m - n + 1 ; i++){
                if (arr[i] < 2) arr[i] = 0;
                else {
                    if (arr[i] % k == 0 && arr[i] != k){
                        arr[i] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < m - n + 1 ; i++){
            if (arr[i] != 0){
                sb.append(arr[i] + "\n");
            }
        }


        System.out.println(sb);
    }
}