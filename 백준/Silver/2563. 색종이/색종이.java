import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] paper = new int[100][100];
        int result = 0;

        for (int i = 0; i < n; i++){
            int[] q = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int k = q[1]; k < q[1]+10; k++){
                for (int l = q[0]; l < q[0]+10; l++){
                    paper[k][l] = 1;
                }
            }

        }

        for (int i = 0; i < 100; i++){
            for (int j = 0; j < 100; j++){
                result += paper[i][j];
            }
        }
        System.out.println(result);
    }
}