import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            Stack stack = new Stack();
            sb.append(br.readLine());
            for (int k = 0; k < sb.length(); k++){
                if (sb.charAt(k) == 40){
                    stack.push(false);
                }else{
                    if (stack.isEmpty()) {
                        stack.push(false);
                        break;
                    }else stack.pop();
                }
            }
            sb.setLength(0);
            if (stack.isEmpty()){
                result.append("YES \n");
            }else {
                result.append("NO \n");
            }
        }
        System.out.println(result);
    }
}