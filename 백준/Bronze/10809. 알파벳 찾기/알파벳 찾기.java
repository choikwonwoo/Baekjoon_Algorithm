import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String q = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr,-1);
        Arrays.stream(arr).distinct();
        for (int i = 0; i < q.length(); i++){
            int index = q.charAt(i) - 97;
            if (arr[index] == -1){
                arr[index] = i;
            }
        }
        for (int l = 0; l < arr.length; l++){
            System.out.print(arr[l]+" ");
        }
    }
}