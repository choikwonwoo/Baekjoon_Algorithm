import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int[] list = new int[b - a + 1];
        for (int i = a; i < b + 1; i++){
            list[i-a] = i;
        }
        for (int k = 2; k < Math.sqrt(b)+1; k++){
            int tmp = k * 2;
            for (int i = 0; i < list.length; i++){
                if (tmp <= list[i] && list[i] % k == 0){
                    list[i] = 0;
                }
            }
        }
        int result = -1;
        int num = 0;
        Boolean flag = true;
        for (int i = 0; i < list.length; i++){
            if (flag && list[i] != 0){
                if (list[i] != 1){
                    num = list[i];
                    flag = false;
                }else {
                    list[i] = 0;
                }
            }
            result += list[i];
        }
        if(result != -1){
            result++;
            System.out.println(result);
            System.out.println(num);
        }else{
            System.out.println(result);
        }

    }
}