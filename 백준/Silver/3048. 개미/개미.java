import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] antLength = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        sb.append(br.readLine()).reverse();
        sb.append(br.readLine());
        int time = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        if (time != 0){
            for (int l = 1; l < time+1; l++){
                int start = antLength[0]-1 -a;
                int end = antLength[0] +b;
                for (int i = start; i < end; i= i+2){
                    String temp = sb.charAt(i) + "";
                    sb.replace(i, i+1, sb.charAt(i+1)+"");
                    sb.replace(i+1, i+2, temp+"");
                }
                if (l < antLength[0]) a++; else a--;
                if (antLength[1] - l > 0) b++; else b--;
            }
        }
        System.out.println(sb);
    }
}