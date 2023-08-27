import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {

  static int n;
  static int m;
  static int arr[];
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    arr = new int[m];
    sc.close();
    DFS(1, 0);
    System.out.println(sb);
  }

  public static void DFS(int start, int depth) {

    if (depth == m) {
        for (int i : arr) {
            sb.append(i + " ");
        }
        sb.append('\n');
        return;
    }

    for (int i = start; i <= n; i++) {
        arr[depth] = i;
        DFS(i, depth + 1);
    }
  }
 
}