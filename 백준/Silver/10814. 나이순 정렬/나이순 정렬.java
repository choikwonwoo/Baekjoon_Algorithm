import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Object[][] list = new Object[n][2];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            list[i][0] = num;
            list[i][1] = str;
        }
        Arrays.sort(list, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                return (int)o1[0] - (int)o2[0];
            }
        });
        for (int i = 0; i < n; i++){
            sb.append(list[i][0] + " " + list[i][1] + "\n");
        }
        System.out.println(sb);
    }
}