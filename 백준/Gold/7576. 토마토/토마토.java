import java.beans.PropertyEditorSupport;
import java.io.*;
import java.util.*;

public class Main {
    static int m,n, dx,dy;
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
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];

        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++){
            int[] qarr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            map[i] = qarr;
            for (int j = 0; j < m; j++){
                if (map[i][j] == 1){
                    q.add(new Dot(i,j));
                }
            }
        }
        int result = solve() - 1;
        label : for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (map[i][j] == 0){
                    result = -1;
                    break label;
                }
            }
        }
        System.out.println(result);

    }
    static public int solve(){
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
                if (nextX >= n || nextY >= m){
                    continue;
                }
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m || visited[nextX][nextY] || map[nextX][nextY] != 0){
                    continue;
                }
                map[nextX][nextY] = map[dx][dy] + 1;
                visited[nextX][nextY] = true;
                q.add(new Dot(nextX,nextY));
            }
        }
        return map[dx][dy];
    }
}

