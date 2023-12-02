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
        for (int i = 0; i < n; i++){
            String str = br.readLine();
            if (str.length() >= 6){
                String[] arr = str.split(" ");
                que.add(arr[1]);
            }else{
                switch (str){
                    case "pop" :
                        sb.append(que.isEmpty() ? -1 + "\n" : que.poll() + "\n");
                        break;
                    case "size" :
                        sb.append(que.size() + "\n");
                        break;
                    case "empty" :
                        sb.append(que.isEmpty() ? 1 +"\n" : 0 + "\n");
                        break;
                    case "front" :
                        sb.append(que.isEmpty() ? -1 + "\n" : que.peekFirst() + "\n");
                        break;
                    case "back" :
                        sb.append(que.isEmpty() ? -1 + "\n" : que.peekLast() + "\n");
                        break;
                }
            }
        }

        System.out.println(sb);
    }
}