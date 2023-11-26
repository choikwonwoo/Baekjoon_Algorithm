import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        int[] list;
        int[] tmp;

        sb.append(br.readLine());
        String str = sb.toString();

        list = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        tmp = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).distinct().sorted().toArray();
        sb.setLength(0);

        for (int i = 0; i < tmp.length; i++){
            map.put(tmp[i],i);
        }
        for (int i = 0; i < n; i++){
            sb.append(map.get(list[i]) + " ");
        }
        System.out.println(sb);
    }
}