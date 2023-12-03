import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque que = new ArrayDeque();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < n + 1; i++) {
            que.add(i);
        }
        while (true){
            int move = arr[(int)que.peek() - 1] > 0 ? arr[(int)que.peek() - 1] - 1 : arr[(int)que.peek() - 1];
            sb.append(que.poll() + " ");
            if (que.isEmpty()) break;
            if (move > 0){
                for (int i = 0; i < move; i++){
                    que.addLast(que.pollFirst());
                }
            }else{
                for (int i = 0; i > move; i--){
                    que.addFirst(que.pollLast());
                }
            }
        }
        System.out.println(sb);
    }
}