import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String q = br.readLine();
        String abc = "ABC/DEF/GHI/JKL/MNO/PQRS/TUV/WXYZ";
        String[] ab = abc.split("/");
        int num = 0;
        for (int i = 0; i < q.length(); i++){
            char c = q.charAt(i);
            for (int j = 0; j < ab.length; j++){
                if (ab[j].indexOf(c) != -1){
                    num += j+3;
                }
            }
        }
        System.out.println(num);
    }
}