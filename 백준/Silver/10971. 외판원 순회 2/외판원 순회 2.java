import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, map[][], answer;
	static boolean visited[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		map = new int[n+1][n+1];
		visited = new boolean[n+1];
		answer = Integer.MAX_VALUE;

		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}

		for(int i = 1; i <= n; i++) {
			visited[i] = true;
			dfs(i, i, 0);
			visited[i] = false;
		}
		
		System.out.println(answer);
	}

	public static void dfs(int start, int line, int sum) {
		boolean finish = true;
		for(int i = 1; i <= n; i++) 
			if(!visited[i]) 
				finish = false;
		
		if(finish && map[line][start] != 0) {
			answer = Math.min(answer, sum+map[line][start]);
			return;
		}
		
		for(int i = 1; i <= n; i++) {
			if(map[line][i] != 0 && !visited[i]) {
				visited[i] = true;
				dfs(start, i, sum + map[line][i]);
				visited[i] = false;
			}
		}
	}
}
