import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if ( a + b + c == 180 ){
            if (  a == b && a == c && b == c ) System.out.println("Equilateral");
                    else if (a != b && a != c && b != c)System.out.println("Scalene");
                    else if (a == b || a == c || b == c)System.out.println("Isosceles");
        }else{
            System.out.println("Error");
        }
    }
}