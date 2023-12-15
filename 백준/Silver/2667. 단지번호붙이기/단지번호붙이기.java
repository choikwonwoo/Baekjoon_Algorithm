import java.beans.PropertyEditorSupport;
import java.io.*;
import java.util.*;

public class Main {
    static int n, dx,dy;
    static int[] arr1 = {-1,1,0,0};
    static int[] arr2 = {0,0,-1,1};
    static boolean[][] visited;
    static int[][] map;
    static Queue<Dot> q = new LinkedList<>();

    static class Dot {
        int x, y;
        Dot(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        int x = 0;
        int y = 0;
        boolean flag = true;
        for (int i = 0; i < n; i++){
            String str = br.readLine();
            for (int j = 0; j < n; j++){
                map[i][j] = str.charAt(j) - '0';
                if (map[i][j] == 1){
                    if (flag){
                        flag = false;
                        q.add(new Dot(i,j));
                    }
                }
            }
        }
        int count = 0;
        ArrayList result = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (!visited[i][j] && map[i][j] != 0){
                    q.add(new Dot(i,j));
                    result.add(solve());
                    count++;
                }
            }
        }
        Collections.sort(result);
        for (int i = 0; i < result.size(); i++){
            sb.append(result.get(i) + "\n");
        }
        System.out.println(count + "\n" + sb);

    }
    static public int solve(){
        int count = 1;
        while (!q.isEmpty()){
            Dot d = q.poll();
            dx = d.x;
            dy = d.y;
            visited[dx][dy] = true;
            int nextX = 0;
            int nextY = 0;
            for (int i = 0; i < 4; i++){
                nextX = d.x + arr1[i];
                nextY = d.y + arr2[i];
                if (nextX >= n || nextY >= n){
                    continue;
                }
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n || visited[nextX][nextY] || map[nextX][nextY] != 1){
                    continue;
                }
                count++;
                visited[nextX][nextY] = true;
                q.add(new Dot(nextX,nextY));
            }
        }
        return count;
    }
}

