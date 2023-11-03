import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] box = new int[n[0]];
        for (int j = 0; j < n[0]; j++){
            box[j] = j+1;
        }

        for (int i = 0; i < n[1]; i++){
            int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int temp = box[list[0]-1];
            box[list[0]-1] = box[list[1]-1];
            box[list[1]-1] = temp;
        }
        for (int k = 0; k < box.length; k++){
            System.out.print(box[k]+ " ");
        }
    }
}