import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] box = new int[n[0]];

        for (int i = 0; i < n[0]; i++){
            box[i] = i+1;
        }
        for (int k = 0; k < n[1]; k++){
            int[] q = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            box = reverse(box,q[0]-1,q[1]-1);
        }
        for (int a = 0; a < box.length; a++){
            System.out.print(box[a]+" ");
        }
    }
    static int[] reverse(int[] arr, int start, int end){
        while (start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        return arr;
    }
}