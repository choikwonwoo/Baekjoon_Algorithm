import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine());

        for (int i = 0; i < q; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            boolean flag = false;

            for (int k = x; k < n * m; k += m){
                if (k % n == y){
                    System.out.println(k + 1);
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.println(-1);
            }
        }


    } // End of main
} // End of class