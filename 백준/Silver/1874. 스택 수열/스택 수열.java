import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int i = 1;
        boolean flag = true;

        for(int s = 0; s < n; s++){
            int num = Integer.parseInt(br.readLine());
            if(i<=num){
                while(i<=num){
                    st.push(i++);
                    sb.append("+\n");
                }
                st.pop();
                sb.append("-\n");
            }else{
                if(st.pop()>num){
                    System.out.println("NO");
                    flag = false;
                    break;
                }
                sb.append("-\n");
            }
        }
        if (flag) System.out.println(sb);
    }
}
