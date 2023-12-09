import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        StringBuilder result = new StringBuilder();
        String bomb = br.readLine();
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < sb.length(); i++){
            stack.push(sb.charAt(i));

            if (stack.size() >= bomb.length()){
                boolean isSame = true;
                for (int j = 0; j < bomb.length(); j++){
                    if (stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)){
                        isSame = false;
                        break;
                    }
                }
                if (isSame){
                    for (int j = 0; j < bomb.length(); j++){
                        stack.pop();
                    }
                }
            }
        }
        if (stack.isEmpty()){
            result.append("FRULA");
        }else{
            while (!stack.isEmpty()){
                result.append(stack.pop());
            }
            result.reverse();
        }
        System.out.println(result);
    }
}