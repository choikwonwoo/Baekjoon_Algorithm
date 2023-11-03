import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[28];
        int i = 0;
        int[] result = new int[2];
        int count = 0;

        while (sc.hasNextInt()){
            arr[i++] = sc.nextInt();
        }
        for (int k = 1; k < 31; k++){
            Boolean find = false;
            for (int l = 0; l<28; l++){
                if (arr[l]==k){
                    find = true;
                    break;
                }
            }
            if (!find){
                result[count++] = k;
            }
        }

        if (result[0]>result[1]){
            int temp = result[0];
            result[0] = result[1];
            result[1] = temp;
        }
        System.out.printf("%d\n%d",result[0],result[1]);
    }
}