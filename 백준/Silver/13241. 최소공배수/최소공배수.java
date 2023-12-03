import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long gcd = solve(a,b);
        sb.append((a * b)/gcd + "\n");

        System.out.println(sb);
    }
    public static long solve(long a , long b){
        if (b == 0){
            return a;
        }
        return solve(b, a % b);
    }
}