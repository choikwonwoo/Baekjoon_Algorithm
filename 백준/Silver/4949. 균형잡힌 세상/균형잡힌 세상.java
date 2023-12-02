import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        while (!str.equals(".")){

            Stack st = new Stack();
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == '(' || str.charAt(i) == '['){
                    st.push(str.charAt(i));
                } else if(str.charAt(i) == ')' || str.charAt(i) == ']'){
                    if (!st.isEmpty()){
                        if (Math.abs((char)st.peek() - str.charAt(i)) <= 2){
                            st.pop();
                        }else{
                            st.push('n');
                            break;
                        }
                    }else{
                        st.push('n');
                        break;
                    }
                }
            }
            if (st.isEmpty()){
                sb.append("yes\n");
            }else{
                sb.append("no\n");
            }
            //str 초기화
            str = br.readLine();
        }
        System.out.println(sb);
    }
}