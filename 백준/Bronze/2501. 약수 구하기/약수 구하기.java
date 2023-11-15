import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < a + 1; i++){
            if (a % i ==0){
                list.add(i);
            }
        }
        if (list.size() < b){
            System.out.println(0);
        }else{
            System.out.println(list.get(b-1));
        }
    }
}