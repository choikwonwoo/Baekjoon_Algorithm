import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ininNum = Integer.parseInt(br.readLine());
        int[] arr = new int[n];


        for (int i = 0; i < n-1; i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num - ininNum;
        }
        int gdc = arr[0];
        for (int i = 1; i < n-1; i++){
            gdc = solve(gdc,arr[i]);
        }

        System.out.println((arr[n-2]/gdc)+1 - n);
    }
    public static int solve(int a, int b){
        if (b == 0){
            return a;
        }
        return solve(b, a % b);
    }

}