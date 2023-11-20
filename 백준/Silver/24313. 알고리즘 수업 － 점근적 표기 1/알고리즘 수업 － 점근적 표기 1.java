import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int f = (a[0] * n) + a[1];
        int g = n * c;

        if (f <= g && a[0] <= c){
            System.out.println(1);
        }else System.out.println(0);
    }
}