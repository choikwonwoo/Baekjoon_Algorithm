import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int count = 1;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (Math.pow(i,2) < n){
                count++;
            }
        }
        System.out.println(count);
    }
}