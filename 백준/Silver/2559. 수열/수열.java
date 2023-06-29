import java.util.*;
import java.io.*;
// 수열
public class Main {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int total = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    int[] arr = new int[total];

    StringTokenizer st2 = new StringTokenizer(br.readLine());
    for (int i = 0; i < total; i++) {
      arr[i] = Integer.parseInt(st2.nextToken());
    }

    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for (int i = 0; i <= total - n; i++) {
      int tempSum = 0;
      for (int j = 0; j < n;  j++) {
        tempSum += arr[i+j];
      }
      pq.add(tempSum);
    }

    System.out.println(pq.poll());
  }
}
