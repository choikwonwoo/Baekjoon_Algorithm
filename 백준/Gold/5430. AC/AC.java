import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            StringBuilder q = new StringBuilder(br.readLine());
            int dqLength = Integer.parseInt(br.readLine().trim());

            boolean vector = true;
            boolean isEmpty = false;
            Deque dq = new ArrayDeque();


            String tmp = br.readLine();
            dq.addAll(Arrays.asList(tmp.substring(1,tmp.length() -1).split(",")));

            if (dqLength == 0) dq.pollFirst();
            for (int j = 0; j < q.length(); j++){
                if (q.charAt(j) == 'R'){
                    vector = !vector;
                }else{
                    if (dq.isEmpty()){
                        isEmpty =true;
                        break;
                    }
                    if (vector){
                        dq.pollFirst();
                    }else{
                        dq.pollLast();
                    }
                }
            }

            if (isEmpty){
                sb.append("error\n");
            }else{
                if (!vector){
                    List list;
                    list = Arrays.asList(dq.toArray());
                    Collections.reverse(list);

                    sb.append(list + "\n");
                }else{
                    sb.append(dq + "\n");
                }
            }
        }
        String result = sb.toString();
        System.out.println(result.replaceAll(" ", ""));
    }
}