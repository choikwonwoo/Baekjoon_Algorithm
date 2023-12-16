import java.beans.PropertyEditorSupport;
import java.io.*;
import java.util.*;

public class Main {
    static Map<Integer, Integer> ladder = new HashMap<>();
    static Map<Integer, Integer> snake = new HashMap<>();
    static boolean[] visited = new boolean[101];
    static int[] map = new int[101];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++){
            StringTokenizer la = new StringTokenizer(br.readLine());
            ladder.put(Integer.parseInt(la.nextToken()),Integer.parseInt(la.nextToken()));
        }
        for (int i = 0; i < m; i++){
            StringTokenizer la = new StringTokenizer(br.readLine());
            snake.put(Integer.parseInt(la.nextToken()),Integer.parseInt(la.nextToken()));
        }
        visited[0] = true;
        map[1] = 1;
        map[100] = Integer.MAX_VALUE;
        System.out.println(solve() - 1);
    }
    public static int solve(){
        Queue<Integer> q = new LinkedList<>();
        int position = 1;
        q.add(position);
        visited[position] = true;
        while (!q.isEmpty()){
            int nowPosition = q.poll();
            int nextPosition;
            visited[nowPosition] = true;
            for (int i = 1; i < 7; i++){
                nextPosition = nowPosition + i;

                if (nextPosition < 101 && !visited[nextPosition]){
                    if (ladder.containsKey(nextPosition)){
                        visited[nextPosition] = true;
                        if (!visited[ladder.get(nextPosition)]){
                            q.add(ladder.get(nextPosition));
                            visited[ladder.get(nextPosition)] = true;
                            map[nextPosition] = map[nowPosition] + 1;
                            map[ladder.get(nextPosition)] = map[nowPosition] + 1;
                        }
                        continue;
                    }
                    if (snake.containsKey(nextPosition)){
                        visited[nextPosition] = true;
                        if (!visited[snake.get(nextPosition)]){
                            q.add(snake.get(nextPosition));
                            visited[snake.get(nextPosition)] = true;
                            map[nextPosition] = map[nowPosition] + 1;
                            map[snake.get(nextPosition)] = map[nowPosition] + 1;
                        }
                        continue;
                    }
                    if (i <= 6){
                        map[nextPosition] = map[nowPosition] + 1;
                        visited[nextPosition] = true;
                        q.add(nextPosition);
                        if (nextPosition == 100) {
                            return map[100];
                        }
                    }
                }
            }
        }
        return  map[100];
    }
}

