import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack stack = new Stack();
        int n = Integer.parseInt(br.readLine());
        int target = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()){
            if (!stack.isEmpty() && (int)stack.peek() == target){
                stack.pop();
                target++;
                continue;
            }
            int num = Integer.parseInt(st.nextToken());
            if (num != target){
                stack.push(num);
            }else{
                target++;
            }
        }
        while (!stack.isEmpty()){
            if ((int)stack.peek() == target){
                stack.pop();
                target++;
            }else{
                break;
            }
        }
        if (stack.isEmpty()){
            sb.append("Nice");
        }else{
            sb.append("Sad");
        }
        System.out.println(sb);
    }
}