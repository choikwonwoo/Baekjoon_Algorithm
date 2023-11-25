import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[1000001];
        int[] list1 = new int[1000001];

        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            if (num > 0){
                list[num-1] = 1;
            } else if (num < 0){
                list1[(num*-1)] = 1;
            }else{
                list1[0] = 1;
            }
        }
        for (int i = list1.length-1; i >= 0; i--){
            if (list1[i] == 1){
                sb.append(i*-1 + "\n");
            }
        }
        for (int i = 0; i < list.length; i++){
            if (list[i] == 1){
                sb.append(i+1 + "\n");
            }
        }
        System.out.println(sb);
    }
}