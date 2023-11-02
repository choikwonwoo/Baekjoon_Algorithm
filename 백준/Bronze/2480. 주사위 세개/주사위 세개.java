import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] roll = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result;
        if (roll[0] == roll[1] && roll[1] == roll[2]){
            result = 10000+(roll[0]*1000);
        }else if (roll[0] == roll[1] || roll[1] == roll[2] || roll[0] == roll[2]){
            if (roll[0] == roll[1]){
                result = 1000+(roll[0]*100);
            } else if (roll[1] == roll[2]) {
                result = 1000+(roll[1]*100);
            } else {
                result = 1000+(roll[0]*100);
            }
        }else{
            result = Arrays.stream(roll).max().getAsInt()*100;
        }
        System.out.println(result);
    }
}