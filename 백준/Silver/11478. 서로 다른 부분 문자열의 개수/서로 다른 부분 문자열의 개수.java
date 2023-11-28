import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        HashSet<String> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());

        int start = 0;
        int end = 1;

        while (start < sb.length()){
            set.add(sb.substring(start,end) + "\n");

            if (end < sb.length()) end++;
            else {
                start++;
                end = start+1;
            }
        }
        System.out.println(set.size());

    }
}