import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2= new HashSet<>();
        HashSet<String> set3= new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int result = 0;

        StringTokenizer stn = new StringTokenizer(br.readLine());
        for (int i = 0; i < n ; i++){
            set1.add(stn.nextToken());
        }
        StringTokenizer stm = new StringTokenizer(br.readLine());
        for (int i = 0; i < m ; i++){
            set2.add(stm.nextToken());
        }

        set3.addAll(set1);
        set3.removeAll(set2);
        set2.removeAll(set1);
        set3.addAll(set2);

        System.out.println(set3.size());
    }
}