import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a1 = Long.parseLong(st.nextToken());
        long a2 = Long.parseLong(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        long b1 = Long.parseLong(st1.nextToken());
        long b2 = Long.parseLong(st1.nextToken());

        long a = (a1 * b2) + (b1 * a2);
        long b = a2 * b2;
        long gcd = solve(a,b);
        sb.append(a/gcd + " " + b/gcd);

        System.out.println(sb);
    }
    public static long solve(long a , long b){
        if (b == 0){
            return a;
        }
        return solve(b, a % b);
    }
}