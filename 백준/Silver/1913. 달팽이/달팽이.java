import java.io.*;

public class Main {
  static final int[] dy = { +1, 0, -1, 0 };
  static final int[] dx = { 0, +1, 0, -1 };
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int n = Integer.parseInt(br.readLine());
    int find = Integer.parseInt(br.readLine());
    int[][] map = new int[n][n];

    int cy = 0;
    int cx = 0;
    int cnt = n * n;
    int dir = 0;
    
    map[cy][cx] = cnt--;

    while (true) {
      int ny = cy + dy[dir];
      int nx = cx + dx[dir];
      if (ny < 0 || nx < 0 || ny >= n || nx >= n) {
        dir = (dir + 1) % 4;
        continue;
      }
      if (map[ny][nx] != 0) {
        dir = (dir + 1) % 4; 
        continue;
      }
      map[ny][nx] = cnt--;
      cy = ny;
      cx = nx;
      if (cnt == 0) break;
    }

    int ay = 0;
    int ax = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        sb.append("" + map[i][j] + " ");
        if (map[i][j] == find) {
          ay = i+1;
          ax = j+1;
        }
      }
      sb.append("\n");
    }
    sb.append(ay + " " + ax);
    System.out.println(sb);
  }
}
