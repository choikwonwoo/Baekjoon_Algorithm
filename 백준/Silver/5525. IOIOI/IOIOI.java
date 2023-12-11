import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb1 = new StringBuilder("I");
        StringBuilder sb2 = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int length = Integer.parseInt(br.readLine());
        int count = 0;
        sb2.append(br.readLine());

        for (int i = 0; i < n; i++){
            sb1.append("OI");
        }

        int sb1Length = sb1.length();

        for (int i = 0; i < length - sb1Length + 1; i++){
            String sub = sb2.substring(i, i + sb1Length);
            if (sub.equals(sb1.toString())){
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}