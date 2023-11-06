import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String q = br.readLine().toUpperCase();
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < q.length(); i++) {
            char c = q.charAt(i);
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c).intValue() + 1);
            } else {
                hm.put(c, 1);
            }
        }
        int max = 0;
        int count = 0;
        char maxc = 0;
        for (Character c : hm.keySet()){
            int num = hm.get(c);
            if (num > max){
                max = num;
                maxc = c;
            }
        }
        for (Character c : hm.keySet()){
            int num = hm.get(c);
            if (num == max){
                count++;
            }
        }
        if (count == 1){
            System.out.println(maxc);
        }else{
            System.out.println("?");
        }
    }
}