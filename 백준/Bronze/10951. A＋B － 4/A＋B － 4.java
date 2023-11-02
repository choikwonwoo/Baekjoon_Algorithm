import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int[] list = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(list[0]+list[1]);
        }
    }
}