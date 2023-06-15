class Solution {
    public int solution(int[][] board) {
        
        int n = board.length;
        int answer = n * n;
        int[][] nArr = new int[n][n];
        
        final int[] dy = { -1, -1, 0, +1, +1, +1, 0 , -1 };
        final int[] dx = { 0, +1, +1, +1, 0, -1, -1, -1 };
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    nArr[i][j]++;
                    for (int dir = 0; dir < 8; dir++) {
                        if (i + dy[dir] >= 0 && j + dx[dir] >= 0 && i + dy[dir] < n && j + dx[dir] < n) {
                            nArr[i+dy[dir]][j+dx[dir]]++;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nArr[i][j] >= 1)
                    --answer;
            }
        }
        return answer;
    }
}