import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque que = new LinkedList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            switch (arr[0]) {
                case 1:
                    que.addFirst(arr[1]);
                    break;
                case 2:
                    que.addLast(arr[1]);
                    break;
                case 3:
                    sb.append(que.isEmpty() ? -1 + "\n" : que.pollFirst() + "\n");
                    break;
                case 4:
                    sb.append(que.isEmpty() ? -1 + "\n" : que.pollLast() + "\n");
                    break;
                case 5:
                    sb.append(que.size() + "\n");
                    break;
                case 6:
                    sb.append(que.isEmpty() ? 1 + "\n" : 0 + "\n");
                    break;
                case 7:
                    sb.append(!que.isEmpty() ? que.peekFirst() + "\n" : -1 + "\n");
                    break;
                case 8:
                    sb.append(!que.isEmpty() ? que.peekLast() + "\n" : -1 + "\n");
                    break;

            }
        }
        System.out.println(sb);
    }
}