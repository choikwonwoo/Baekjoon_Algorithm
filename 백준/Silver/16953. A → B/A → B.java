import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Integer.parseInt(st.nextToken());

        Queue<Long> q = new LinkedList();
        Set<Long> visited = new HashSet<>();
        q.add(n);
        boolean flag = false;
        int result = 0;
        int count = 0;
        label : while (!q.isEmpty()){
            int qSize = q.size();
            for (int i = 0; i < qSize; i++){
                long tmp = q.poll();
                long addOne = tmp * 10 + 1;
                long mul = tmp * 2;
                if (tmp == m) {
                    count++;
                    flag = true;
                    break label;
                }
                if (!visited.contains(addOne) && addOne <= m){
                    q.add(addOne);
                    visited.add(addOne);
                }
                if (!visited.contains(mul) && mul <= m){
                    q.add(mul);
                    visited.add(mul);
                }
            }
            count++;
        }
        System.out.println(result = flag ? count : -1);
    }
}

