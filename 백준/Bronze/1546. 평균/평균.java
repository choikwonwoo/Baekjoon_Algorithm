import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String q = br.readLine();
        String[] score;
        score = q.split(" ");
        int max = 0;
        for(int i=0; i<n; i++) {
        	if(max<Integer.parseInt(score[i])) {
        		max =Integer.parseInt(score[i]);
        	}
        }
        float result = 0f;
        for(int i=0; i<n; i++) {
        	result += (Float.parseFloat(score[i]))/max*100;
        }
        System.out.println(result/n);
	}
}