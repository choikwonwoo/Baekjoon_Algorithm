import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] chess = {1,1,2,2,2,8};
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < chess.length; i++){
            if (chess[i] != arr[i]){
                sb.append((arr[i] - chess[i])*-1+" ");
            }else {
                sb.append("0 ");
            }
        }
        System.out.println(sb);

    }
}