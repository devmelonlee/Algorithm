import java.io.*;

public class Main {
  static int tc;
  static int M;
  static int N;
  static int[][] visited;
  static int[][] map;
  static final int[] dy = { -1, 0, +1, 0 };
  static final int[] dx = { 0, +1, 0, -1 };
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
  public static void main(String[] args) throws IOException {
    StringBuilder sb = new StringBuilder();
    tc = Integer.parseInt(br.readLine());

    for (int i = 0; i < tc; i++) {
      int cnt = 0;
      input();
      for (int j = 0; j < N; j++) {
        for (int k = 0; k < M; k++) {
          if (map[j][k] == 1 && visited[j][k] == 0) {
            dfs(j, k);
            cnt++;
          }
          
        }
      }
      sb.append("" + cnt + "\n");
    }
    System.out.println(sb);
  }
  
  public static void input() throws IOException {
    String[] str = br.readLine().split(" ");
    M = Integer.parseInt(str[0]);
    N = Integer.parseInt(str[1]);
    int K = Integer.parseInt(str[2]);
    
    map = new int[N+1][M+1];
    visited = new int[N+1][M+1];
    
    for (int i = 0; i < K; i++) {
      String[] str2 = br.readLine().split(" ");
      int x = Integer.parseInt(str2[0]);
      int y = Integer.parseInt(str2[1]);
      map[y][x] = 1;
    }
  }

  static void dfs(int y, int x) {
    if (y >= 0 && x >= 0 && y < N && x < M) {
      if (map[y][x] == 1 && visited[y][x] == 0) {
        visited[y][x] = 1;
        for (int i = 0; i < 4; i++) {
          dfs(y+dy[i], x+dx[i]);
          dfs(y+dy[i], x+dx[i]);
          dfs(y+dy[i], x+dx[i]);
          dfs(y+dy[i], x+dx[i]);
        }
      }
    }
  }

}
