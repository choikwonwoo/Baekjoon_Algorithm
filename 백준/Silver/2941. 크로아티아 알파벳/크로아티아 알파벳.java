import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String q = br.readLine();

        for (int i = 0; i < croatia.length; i++){
            String cr = croatia[i];
            if (q.contains(cr)){
                q = q.replace(cr,i+"");
            }
        }
        System.out.println(q.length());
    }

}