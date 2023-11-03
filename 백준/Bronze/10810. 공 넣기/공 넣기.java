import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] box = new int[n[0]];

        for (int i = 0; i < n[1]; i++){
            int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = list[0]-1; j<=list[1]-1; j++){
                box[j] = list[2];
            }
        }
        for (int k = 0; k < box.length; k++){
            System.out.print(box[k]+ " ");
        }
    }
}