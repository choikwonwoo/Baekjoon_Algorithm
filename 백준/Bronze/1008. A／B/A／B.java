import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] list = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        System.out.println(list[0]/list[1]);
    }
}