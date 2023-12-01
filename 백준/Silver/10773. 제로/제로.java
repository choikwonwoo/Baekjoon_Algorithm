import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack stack = new Stack();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            if (num == 0){
                stack.pop();
            }else{
                stack.push(num);
            }
        }
        while (!stack.isEmpty()){
            result += (int)stack.pop();
        }
        System.out.println(result);
    }
}