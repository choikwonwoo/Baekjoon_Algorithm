import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());


            int Y = m % h == 0 ? m / h : m / h + 1; // 호수
            int X = m % h == 0 ? h : m % h; // 층
            if (Y < 10){
                System.out.printf("%d0%d\n",X,Y);
            }else{
                System.out.printf("%d%d\n",X,Y);
            }
        }
    }
}