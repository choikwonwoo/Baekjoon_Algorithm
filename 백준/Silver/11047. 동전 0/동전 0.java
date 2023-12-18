import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int result = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = n - 1; i >= 0; i--){
            if (arr[i] > money){
                continue;
            }
            result += money / arr[i];
            money = money % arr[i];
        }

        System.out.println(result);
    }
}

