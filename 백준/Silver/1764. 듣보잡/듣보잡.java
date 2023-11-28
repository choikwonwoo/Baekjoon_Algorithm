import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        HashSet<String> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int result = 0;
        String[] arr = new String[m];

        for (int i = 0; i < n; i++){
            set.add(br.readLine());
        }

        for (int i = 0; i < m; i++){
            arr[i] = br.readLine();
        }
        Arrays.sort(arr);
        for (int i = 0; i < m; i++){
            if (set.contains(arr[i])){
                result++;
                sb.append(arr[i] + "\n");
            }
        }
        sb.insert(0,result + "\n");
        System.out.println(sb);
    }
}