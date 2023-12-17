import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> map = new HashMap<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++){
            StringTokenizer tmp = new StringTokenizer(br.readLine());
            map.put(tmp.nextToken(), tmp.nextToken());
        }
        for (int i = 0; i < m; i++){
            String tmp = br.readLine();
            sb.append(map.get(tmp) + "\n");
        }
        System.out.println(sb);
    }
}

