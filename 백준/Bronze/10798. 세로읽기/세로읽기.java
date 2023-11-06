import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[5];
        int max = 0;
        for (int i = 0; i < 5; i++){
            str[i] = br.readLine();
            if (str[i].length()>max){
                max = str[i].length();
            }
        }

        for (int k = 0; k < max; k++){
            for (int i = 0; i < 5; i++) {
                if (str[i].length() > k) {
                    System.out.print(str[i].charAt(k));
                }
            }
        }
    }

}