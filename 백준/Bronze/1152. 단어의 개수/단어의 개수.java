import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().trim().split("\\s+");
        if (arr[0].isEmpty()){
            System.out.println(0);
        }else{
            System.out.println(arr.length);
        }
    }
}