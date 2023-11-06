import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int itor1 = n-1;
        int itor2 = 1;
        for (int i = 1; i < 2*n; i++){
            for (int k = 0; k<itor1; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k<itor2; k++){
                System.out.print("*");
            }
            if (i > n-1){
                itor1++;
                itor2 -= 2;
            }else{
                itor1--;
                itor2 += 2;
            }
            System.out.print("\n");
        }
    }
}