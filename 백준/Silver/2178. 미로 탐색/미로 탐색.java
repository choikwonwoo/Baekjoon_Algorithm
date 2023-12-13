import java.io.*;
import java.util.*;

public class Main {
    static int n, m, x, y;
    static int[][] map;
    static int[] arr1 = {0,0,-1,1};
    static int[] arr2 = {-1,1,0,0};
    static boolean[][] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++){
            String str = br.readLine();

            for (int j = 0; j < m; j++){
                map[i][j] = str.charAt(j) - '0';
            }
        }
        System.out.println(solve(0,0));
    }
    public static int solve(int x , int y){
        Queue<Dot> q = new LinkedList();
        q.add(new Dot(x,y));
        visited[x][y] = true;

        while (!q.isEmpty()){
            Dot d = q.poll();
            x = d.x;
            y = d.y;
            for (int i = 0; i < 4; i++){
                int nextX = d.x + arr1[i];
                int nextY = d.y + arr2[i];
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m || visited[nextX][nextY] || map[nextX][nextY] == 0){
                    continue;
                }
                map[nextX][nextY] = map[x][y] + 1;
                visited[nextX][nextY] = true;
                q.add(new Dot(nextX,nextY));
            }
        }
        return map[n-1][m-1];
    }
    static class Dot{
        int x;
        int y;
        public Dot(int x , int y){
            this.x = x;
            this.y = y;
        }
    }
}

