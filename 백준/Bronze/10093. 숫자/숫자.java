import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long start = Long.parseLong(st.nextToken());
    long end = Long.parseLong(st.nextToken());
    
    StringBuilder sb = new StringBuilder();

    if (start > end) {
      sb.append(start - end - 1 + "\n");
      for (long i = end + 1; i < start; i++) {
        sb.append(i + " ");
      }
    }
    if (start < end) {
      sb.append(end - start - 1 + "\n");
      for (long i = start + 1; i < end; i++) {
        sb.append(i + " ");
      }
    }
    if (start == end)
      sb.append(0);
    System.out.println(sb);
  }
}