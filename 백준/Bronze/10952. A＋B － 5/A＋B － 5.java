import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (list[0] + list[1] != 0){
                System.out.println(list[0] + list[1]);
            }else{
                break;
            }
        }
    }
}