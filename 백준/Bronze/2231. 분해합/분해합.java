import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int index = 1;
        int result = 0;
        while (index < num){
            int tmp = num - index++;
            int tmp1 = tmp;
            int sum = 0;
            while (tmp1 != 0){
                sum += tmp1 % 10;
                tmp1 /= 10;
            }
            if (sum + tmp == num){
                result = tmp;
            }
        }
        System.out.println(result);
    }
}