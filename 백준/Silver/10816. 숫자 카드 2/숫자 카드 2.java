import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());

        String[] arr1 = br.readLine().split(" ");
        for (int i = 0; i < m ; i++){
            map.put(arr1[i],0);
        }
        for (String str : arr){
            map.put(str,map.get(str) == null ? 0 : map.get(str) + 1);
        }
        for (int i = 0; i < m; i++){
            sb.append(map.get(arr1[i]) + " ");
        }
        System.out.println(sb);
    }
}