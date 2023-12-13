import java.io.*;
import java.util.*;

public class Main {
    static int n, x, y;
    static char[][] map;
    static int[] arr1 = {0,0,-1,1};
    static int[] arr2 = {-1,1,0,0};
    static boolean[][] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        map = new char[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++){
            String str = br.readLine();

            for (int j = 0; j < n; j++){
                map[i][j] = str.charAt(j);
            }
        }
        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (!visited[i][j]){
                    solve(i,j);
                    result1++;
                }
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (map[i][j] == 'G'){
                    map[i][j] = 'R';
                }
            }
        }
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (!visited[i][j]){
                    solve(i,j);
                    result2++;
                }
            }
        }
        System.out.printf("%d %d",result1,result2);
    }
    public static void solve(int x , int y){
        Queue<Dot> q = new LinkedList();
        q.add(new Dot(x,y));
        visited[x][y] = true;

        while (!q.isEmpty()){
            Dot d = q.poll();

            for (int i = 0; i < 4; i++){
                int nextX = d.x + arr1[i];
                int nextY = d.y + arr2[i];
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >=n || visited[nextX][nextY] || map[nextX][nextY] != map[x][y]){
                    continue;
                }
                if (map[nextX][nextY] == map[x][y]){
                    visited[nextX][nextY] = true;
                }
                q.add(new Dot(nextX,nextY));
            }
        }
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

