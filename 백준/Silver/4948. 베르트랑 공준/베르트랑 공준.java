import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayList narr = new ArrayList();
        ArrayList oarr = new ArrayList();
        ArrayList index = new ArrayList();
        ArrayList oindex = new ArrayList();

        while (true){
            int num = Integer.parseInt(br.readLine());
            if (num == 0){
                break;
            }else{
                oarr.add(num);
                narr.add(num);
            }
        }
        Collections.sort(narr);
        for (int i = 0; i < narr.size(); i++){
            index.add(((int)narr.get(i) * 2) - (int)narr.get(0));
            oindex.add(((int)oarr.get(i) * 2) - (int)narr.get(0));
        }

        int[] arr = new int[((int)narr.get(narr.size() - 1) * 2 - (int)narr.get(0)) + 1];

        for (int i = (int)narr.get(0); i <= (int)narr.get(narr.size()-1) * 2; i++){
            arr[i - (int)narr.get(0)] = i;
        }
        for (int k = 2; k <= Math.sqrt(2*(int)narr.get(narr.size()-1)); k++){
            for (int i = 0; i < arr.length; i++){
                if ((arr[i] % k == 0 && arr[i] != k) || arr[i] < 2){
                    arr[i] = 0;
                }
            }
        }
        int point = 0;
        for (int i = 0; i < narr.size(); i++){
            int start = (int)oarr.get(i) - (int)narr.get(0) + 1;
            int end = (int)oindex.get(point++);
            int count = 0;
            for (int k = start; k <= end ; k++){
                if (arr[k] > start){
                    count++;
                }
            }
            sb.append(count + "\n");
            count = 0;
        }

        System.out.println(sb);
    }
}