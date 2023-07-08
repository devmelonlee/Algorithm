import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    for (int i = n; i > 0; i--) {
      for (int j = n - i; j > 0; j--) {
        System.out.print(" ");
      }
      for (int k = 2 * i - 1; k > 0; k--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
