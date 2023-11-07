import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] n = br.readLine().split(" ");
        int result = 0;
        for (int i = n[0].length()-1, j = -n[0].length()+1; i >= 0; i--, j+=2){
            int num = 0;
            if (n[0].charAt(i) < 65){
                num = n[0].charAt(i) - '0';
            }else{
                num = n[0].charAt(i) - 55;
            }
            Double point = Math.pow(Integer.parseInt(n[1]),i+j);
            result += point * num;
        }
        System.out.println(result);
    }
}