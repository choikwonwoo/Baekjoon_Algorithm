import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        int[] list = new int[sb.length()];

        for (int i = 0; i < sb.length(); i++){
            list[i] = sb.charAt(i)-'0';
        }
        sb.setLength(0);
        list = Arrays.stream(list).sorted().toArray();
        for (int i = 0; i < list.length; i++){
            sb.append(list[i]);
        }
        sb.reverse();
        System.out.println(sb);
    }
}