import java.util.StringTokenizer;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine(), " ");
    Long temp = 0L;
    while(st.hasMoreTokens()) {
      temp += Long.parseLong(st.nextToken());
    }
    bw.write(temp + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
} 
