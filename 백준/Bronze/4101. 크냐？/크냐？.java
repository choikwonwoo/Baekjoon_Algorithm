import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            if (a == 0 && b == 0){
                break;
            }
            if (a<=b){
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }
    }
}

