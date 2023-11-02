import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int c = x*y;
        if(c>0){
            if(x>0){
                System.out.println(1);
            } else{
                System.out.println(3);
            }
        } else {
            if(x>0){
                System.out.println(4);
            } else{
                System.out.println(2);
            }
        }
    }
}