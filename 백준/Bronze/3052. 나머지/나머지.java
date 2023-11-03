import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        Scanner sc = new Scanner(System.in);
        Set<Integer> list = new HashSet<Integer>();

        while (sc.hasNextInt()){
            list.add(sc.nextInt()%42);
        }
        System.out.println(list.size());
    }
}