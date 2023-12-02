import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue que = new LinkedList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n + 1; i++){
            que.add(i);
        }
        while (!que.isEmpty()){
            for (int i = 0; i < m-1; i++){
                // 회전
                que.add(que.poll());
            }
            // 제거
            sb.append(que.poll() + ", ");
        }
        sb.replace(sb.length()-2,sb.length(),">");
        System.out.println(sb);
    }
}