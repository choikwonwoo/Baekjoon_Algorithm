import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            map.put(name,state);
        }
        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        Collections.reverse(keySet);
        for (String keyset : keySet){
            if (map.get(keyset).equals("enter")){
                sb.append(keyset + "\n");
            }
        }

        System.out.println(sb);
    }
}