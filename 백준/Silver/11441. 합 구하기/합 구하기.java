import java.io.*;
import java.util.*;
// 합 구하기
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
   
    int n = Integer.parseInt(br.readLine());
    int[] sumArr = new int[n+1];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 1; i <= n; i++) {
      sumArr[i] = sumArr[i - 1] + Integer.parseInt(st.nextToken());
    }

    int m = Integer.parseInt(br.readLine());
    for (int i = 0; i < m; i++) {
      StringTokenizer st2 = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st2.nextToken());
      int b = Integer.parseInt(st2.nextToken());
      sb.append(sumArr[b] - sumArr[a - 1] + "\n");
    }

    System.out.println(sb.toString());
  }

}
