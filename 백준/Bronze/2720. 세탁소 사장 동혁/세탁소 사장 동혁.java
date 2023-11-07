import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] coins = {25,10,5,1};

        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            for (int k = 0; k < coins.length; k++){
                System.out.print( num / coins[k] + " ");
                num = num % coins[k];
            }
            System.out.println();
        }
    }
}