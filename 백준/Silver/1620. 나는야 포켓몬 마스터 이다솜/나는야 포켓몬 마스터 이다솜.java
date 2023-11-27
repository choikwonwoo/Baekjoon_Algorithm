import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map1 = new HashMap<>();
        HashMap<String,String> map2 = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n + 1; i++){
            String str = br.readLine();
            map1.put(str, i+"" );
            map2.put(i+"" , str);
        }
        for (int i = 0; i < m; i++){
            String q = br.readLine();
            if (q.matches("-?\\d+")){
                sb.append(map2.get(q) + "\n");
            }else{
                sb.append(map1.get(q) + "\n");
            }
        }
        System.out.println(sb);
    }
}