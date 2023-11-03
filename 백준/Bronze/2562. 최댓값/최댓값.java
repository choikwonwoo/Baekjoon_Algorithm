import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int index = 1;
        int conter = 1;

        do {
            conter++;
            int num = sc.nextInt();
            if(num>=max){
                max = num;
                index = conter;
            }
        }while (sc.hasNextInt());

        System.out.printf("%d\n%d",max,index);
    }
}