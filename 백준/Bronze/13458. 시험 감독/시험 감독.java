import java.io.*;
import java.util.*;
 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
 
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
 
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
 
        long total = n;
        for (int i = 0; i < n; i++) {
            arr[i] -= a;
            if (arr[i] > 0) {
                total += arr[i] / b;
                if(arr[i] % b != 0) {
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}