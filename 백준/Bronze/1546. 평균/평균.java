import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int n, m = 0;
    float tmp, ret = 0.0f;

    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();

    Arrays.sort(arr);
    m = arr[arr.length-1];

    for(int i = 0; i < n; i++) {
      tmp = ((arr[i] / (float) m) * 100);
      ret += tmp;
    }
    ret /= n;
    System.out.println(ret);
  }
}