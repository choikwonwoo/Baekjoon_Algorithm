import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            list[i] = num;
        }
        list = Arrays.stream(list).sorted().toArray();
        for (int i = 0; i < list.length; i++){
            sb.append(list[i] + "\n");
        }
        System.out.println(sb);
    }
}