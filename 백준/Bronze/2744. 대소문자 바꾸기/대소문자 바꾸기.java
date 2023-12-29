import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c < 96){
                char c1 = (char)(c + 32);
                sb.append(c1);
            }else{
                char c1 = (char)(c - 32);
                sb.append(c1);
            }
        }
        System.out.println(sb);
    }
}

