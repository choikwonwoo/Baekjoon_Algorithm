import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] time = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = time[1] - 45;
        int hour = time[0];

        if (min < 0){
            hour--;
            if (hour<0){
                hour=23;
            }
            min = 60 + min;
        }
        System.out.printf("%d %d",hour,min);
    }
}