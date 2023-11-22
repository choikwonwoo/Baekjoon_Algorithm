import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        int sum = 0;
//        label:while (true){
            for (int i = 0; i < list.length - 2; i++){
                for (int j = i + 1; j < list.length - 1; j++){
                    for (int k = j + 1; k < list.length; k++){
                        if (list[i] + list[j] + list[k] <= m && list[i] + list[j] + list[k] > sum){
                            sum = list[i] + list[j] + list[k];
                        }
                    }
                }
            }
//        }
        System.out.println(sum);
    }
}