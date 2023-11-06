import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String q = br.readLine();
        StringBuilder sb = new StringBuilder(q);

        if (sb.reverse().toString().equals(q)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}