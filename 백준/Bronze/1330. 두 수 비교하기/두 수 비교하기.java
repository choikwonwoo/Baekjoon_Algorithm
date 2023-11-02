import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if(list[0]>list[1]){
            System.out.print(">");
        } else if (list[0]<list[1]) {
            System.out.print("<");
        } else {
            System.out.print("==");
        }
    }
}