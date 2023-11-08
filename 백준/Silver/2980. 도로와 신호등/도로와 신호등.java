import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        int[][] list = new int[count][3];
        int time = 0;
        int a = 0;

        for (int i = 0; i < count; i++) {
            list[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < length + 1; i++) {
            // 신호등을 만났다면!.
            if (i == list[a][0]) {
                // 나누고 남은 시간
                int sum = list[a][1] + list[a][2];
                int lastTime = time % sum;

                if (lastTime == 0){
                    time += list[a][1];
                }else{
                    if (lastTime < list[a][1]){
                        time += list[a][1] - lastTime;
                    }
                }
                // 다음 신호등
                if (a<list.length-1) a++;
            }
            time++;

        }
        System.out.println(time-1);
    }
}