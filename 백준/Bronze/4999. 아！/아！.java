import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        boolean go = str1.length() < str2.length();

        if (go){
            System.out.println("no");
        }else{
            System.out.println("go");
        }
    }

}

