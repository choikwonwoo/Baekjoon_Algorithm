import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] visited;
    static int[][] map;
    static int[] arr1 = {1,-1,0,0};
    static int[] arr2 = {0,0,1,-1};
    static int n,m;

    static class Dot{
        int x;
        int y;
        public Dot(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        int x = 0;
        int y = 0;
        boolean isFind = false;
        for (int i = 0; i < n; i++){
            int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            map[i] = tmp;
            if (!isFind){
                for (int j = 0; j < m; j++){
                    if (tmp[j] == 2){
                        isFind = true;
                        map[i][j] = 0;
                        x = i;
                        y = j;
                        break;
                    }
                }
            }
        }
        solve(x,y);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (map[i][j] == 1 && !visited[i][j]){
                    map[i][j] = -1;
                }
                sb.append(map[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static void solve(int x, int y){
        Queue<Dot> q = new LinkedList<>();
        q.add(new Dot(x,y));
        visited[x][y] = true;

        while (!q.isEmpty()){
            Dot d = q.poll();
            int nextX;
            int nextY;
            for (int i = 0; i < 4; i++){
                nextX = d.x + arr1[i];
                nextY = d.y + arr2[i];

                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m ) continue;
                if( visited[nextX][nextY] || map[nextX][nextY] == 0) continue;

                visited[nextX][nextY] = true;
                map[nextX][nextY] = map[d.x][d.y] + 1;
                q.add(new Dot(nextX,nextY));
            }
        }
    }
}

