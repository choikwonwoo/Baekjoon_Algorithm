import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque que = new ArrayDeque();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        while (st1.hasMoreTokens()){
            String str1 = st1.nextToken();
            String str2 = st2.nextToken();

            if (str1.equals("0")){
                que.add(str2);
            }
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());

        while (st3.hasMoreTokens()){
            String num = st3.nextToken();
            que.addFirst(num);
            sb.append(que.pollLast() + " ");
        }
        System.out.println(sb);
    }
}