import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr =  Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = 0;
        int index = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        arr[index] = 0;
        int sum = Arrays.stream(arr).sum();
        if (sum <= max){
            result = sum + sum - 1;
        }else{
            result = sum + max;
        }
        System.out.println(result);
    }
}