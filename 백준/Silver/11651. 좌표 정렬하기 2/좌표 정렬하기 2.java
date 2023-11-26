import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[][] list = new int[n][2];
        for (int i = 0; i < n; i++){
            list[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        Arrays.sort(list, (o1, o2) -> o1[1]!=o2[1] ? o1[1]-o2[1] : o1[0]-o2[0]);
        for (int i = 0; i < n; i++){
            sb.append(list[i][0] + " " + list[i][1] + "\n");
        }
        System.out.println(sb);
    }
}