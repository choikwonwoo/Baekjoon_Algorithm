import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack stack = new Stack();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            String str = br.readLine();
            if (str.length() > 1){
                stack.push(str.split(" ")[1]);
            }else{
                switch (str){
                    case "2" : sb.append(stack.empty() ? -1 + "\n" : stack.pop() + "\n" );
                        break;
                    case "3" : sb.append(stack.size() + "\n" );
                        break;
                    case "4" : sb.append(stack.isEmpty() ? 1 + "\n"  : 0 + "\n" );
                        break;
                    case "5" : sb.append(stack.empty() ? -1 + "\n"  : stack.peek() + "\n" );
                        break;
                }
            }
        }
        System.out.println(sb);
    }
}