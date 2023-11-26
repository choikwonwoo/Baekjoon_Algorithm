import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Object[][] list = new Object[n][2];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++){
            String str = br.readLine();
            int leng = str.length();
            list[i][0] = leng;
            list[i][1] = str;
        }
        Arrays.sort(list, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                return (int)o1[0] != (int)o2[0] ? (int)o1[0] - (int)o2[0] : o1[1].toString().compareTo(o2[1].toString());
            }
        });
        for (int i = 0; i < n; i++){
            if (sb.indexOf(list[i][1].toString())==-1) sb.append(list[i][1] + "\n");
        }
        System.out.println(sb);
    }
}