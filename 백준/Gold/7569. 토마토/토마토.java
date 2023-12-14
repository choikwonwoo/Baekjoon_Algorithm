import java.io.*;
import java.util.*;

public class Main {
    static int n, m, h, x, y, z;
    static int[][][] map;
    static int[] arr1 = {0,0,-1,1,0,0};
    static int[] arr2 = {-1,1,0,0,0,0};
    static int[] arr3 = {0,0,0,0,-1,1};
    static Queue<Dot> q = new LinkedList();
    static boolean[][][] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        map = new int[h][n][m];
        visited = new boolean[h][n][m];


        for (int k = 0; k < h; k++){
            for (int i = 0; i < n; i++){
                int[] qarr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                map[k][i] = qarr;
                for (int a = 0; a < m; a++){
                    if (qarr[a] == 1){
                        q.add(new Dot(k,i,a));
                        visited[k][i][a] = true;
                    }
                }
            }
        }
        int result = solve() - 1;
        label : for (int k = 0; k < h; k++){
            for (int i = 0; i < n; i++){
                for (int a = 0; a < m; a++){
                    if (map[k][i][a] == 0){
                        result = -1;
                        break label;
                    }
                }
            }
        }
        System.out.println(result);
    }
    public static int solve(){


        while (!q.isEmpty()){
            Dot d = q.poll();
            x = d.x;
            z = d.z;
            y = d.y;
            for (int i = 0; i < 6; i++){
                int nextX = d.x + arr1[i];
                int nextY = d.y + arr2[i];
                int nextZ = d.z + arr3[i];
                if (nextX < 0 || nextY < 0 || nextZ < 0 || nextZ >= h || nextX >= n || nextY >= m || visited[nextZ][nextX][nextY] || map[nextZ][nextX][nextY] != 0){
                    continue;
                }
                map[nextZ][nextX][nextY] = map[z][x][y] + 1;
                visited[nextZ][nextX][nextY] = true;
                q.add(new Dot(nextZ,nextX,nextY));
            }
        }
        return map[z][x][y];
    }
    static class Dot{
        int x;
        int y;
        int z;
        public Dot(int z , int x, int y){
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}

