import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] time = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int cookTime = Integer.parseInt(br.readLine());
        int min = time[1];
        int hour = time[0];

        if(min + cookTime >= 60){
            hour += (min + cookTime)/60;
            min = (min + cookTime)%60;
            if (hour>23){
                hour -= 24;
            }
        }else{
            min = min + cookTime;
        }
        System.out.printf("%d %d",hour,min);
    }
}