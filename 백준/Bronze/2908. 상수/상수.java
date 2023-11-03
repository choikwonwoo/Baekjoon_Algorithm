import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int num1 = change(arr[0]);
        int num2 = change(arr[1]);
        System.out.println(num1 > num2 ? num1 : num2);
    }
    public static Integer change(String str){
        StringBuilder sb = new StringBuilder(str);
        str = sb.reverse().toString();
        return Integer.parseInt(str);
    }
}