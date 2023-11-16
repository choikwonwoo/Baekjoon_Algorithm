import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int max = 0 ;
            int index = 0;
            for (int i = 0; i < arr.length; i++){
                if (max < arr[i]){
                    max = arr[i];
                    index = i;
                }
            }
            arr[index] = 0;

            if (max == 0) {
                break;
            } else{
                if (Arrays.stream(arr).sum() <= max){
                    System.out.println("Invalid");
                    continue;
                }else {
                    arr[index] = max;
                }
            }

            if ( arr[0] == arr[1] && arr[0] == arr[2] && arr[1] == arr[2] )System.out.println("Equilateral");
                else if (arr[0] != arr[1] && arr[0] != arr[2] && arr[1] != arr[2])System.out.println("Scalene");
                else if (arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2])System.out.println("Isosceles");
        }


    }
}