import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int targer = Integer.parseInt(br.readLine());
        int result = 0;
        while (st.hasMoreTokens()){
            if (Integer.parseInt(st.nextToken()) == targer){
                result++;
            }
        }
        System.out.println(result);
    }
}