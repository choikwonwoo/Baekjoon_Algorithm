import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Double result = 0d;
        Double score = 0.0;
        for (int i = 0; i < 20; i++){
            String[] str = br.readLine().split(" ");
            switch (str[2]){
                case  "A+" :
                    result += Double.parseDouble(str[1]) * 4.5;
                    score += Double.parseDouble(str[1]);
                    break;
                case  "A0" :
                    result += Double.parseDouble(str[1]) * 4.0;
                    score += Double.parseDouble(str[1]);
                    break;
                case  "B+" :
                    result += Double.parseDouble(str[1]) * 3.5;
                    score += Double.parseDouble(str[1]);
                    break;
                case  "B0" :
                    result += Double.parseDouble(str[1]) * 3.0;
                    score += Double.parseDouble(str[1]);
                    break;
                case  "C+" :
                    result += Double.parseDouble(str[1]) * 2.5;
                    score += Double.parseDouble(str[1]);
                    break;
                case  "C0" :
                    result += Double.parseDouble(str[1]) * 2.0;
                    score += Double.parseDouble(str[1]);
                    break;
                case  "D+" :
                    result += Double.parseDouble(str[1]) * 1.5;
                    score += Double.parseDouble(str[1]);
                    break;
                case  "D0" :
                    result += Double.parseDouble(str[1]) * 1.0;
                    score += Double.parseDouble(str[1]);
                    break;
                case  "F" :
                    result += Double.parseDouble(str[1]) * 0.0;
                    score += Double.parseDouble(str[1]);
                    break;
                default:
                    break;

            }
        }
        System.out.println(result/score);
    }

}