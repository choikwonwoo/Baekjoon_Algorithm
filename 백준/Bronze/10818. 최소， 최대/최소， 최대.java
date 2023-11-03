import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int min = first;
        int max = first;
        while (st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if(num >= max){
                max = num;
            }
            if (num <= min){
                min = num;
            }
        }
        System.out.printf("%d %d",min,max);
    }
}