import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int count = 0;
        while (count < 5){
            int num = sc.nextInt();
            list.add(num);
            sum += num;
            count++;
        }
        Collections.sort(list);
        System.out.println(sum / count);
        count = count % 2 == 0 ? (count / 2) -1  : (count / 2);
        System.out.println(list.get(count));
    }
}