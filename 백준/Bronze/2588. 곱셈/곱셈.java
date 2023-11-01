import java.io.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br.readLine();
        String num2 = br.readLine();
        int result1 = 0;
        int posi2 = 1;
        for(int i = num2.length()-1; i>=0; i--){
            int result = 0;
            int posi1 = 1;
            for (int j = num1.length()-1; j>=0; j--){
                int a = num2.charAt(i)-'0';
                int b = num1.charAt(j)-'0';

                result += a*b*posi1;
                posi1 *=10;
            }
            System.out.println(result);
            result1 += result*posi2;
            posi2 *= 10;
        }
        System.out.println(result1);
    }
}