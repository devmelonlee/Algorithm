import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] pos = new int[10];
    boolean[] visited = new boolean[10];
    int cnt = 0;

    for (int i = 0; i < n; i++) {
      String[] str = br.readLine().split(" ");
      int a = Integer.parseInt(str[0]);
      int b = Integer.parseInt(str[1]);

      if (!visited[a - 1]) {
        pos[a - 1] = b;
        visited[a - 1] = true;
      }
      else 
        if (pos[a - 1] != b) {
          pos[a - 1] = b;
          cnt++;
        }
    }
    System.out.println(cnt);
  }
}
