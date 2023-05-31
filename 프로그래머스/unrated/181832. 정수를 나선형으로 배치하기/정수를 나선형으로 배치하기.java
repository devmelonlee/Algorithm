class Solution {
    public int[][] solution(int n) {
        int[][] answer = {};
        answer = new int [n][n];
        
        final int[] dy = { 0, +1, 0, -1 };
        final int[] dx = { +1, 0, -1, 0 };
        
        int cy, cx , ddy, ddx;
        cy = cx = ddy = ddx = 0;
        int cn = 1;
        
        if (n == 1) {
            answer[0][0] = 1;
            return answer;
        }
       
        for (int i = n - 1; i > 0; i--) { // 반복문 처음
            answer[cy][cx] = cn++;  // 3
            cy+=dy[ddy];
            cx+=dx[ddx];
        }
        ddy++; // 배열 방향 바꾸기
        ddx++;
        int number = n - 1;

        for (int i = n - 1; i > 0; --i) {
            for (int j = 2; j > 0; --j) {
                for (int k = number; k > 0; --k) { // 33 // 22 // 11
                    answer[cy][cx] = cn++; // 3
                    cy+=dy[ddy];
                    cx+=dx[ddx];
                    if(number == 1)
                        answer[cy][cx] = cn;
                }
                ddy++; // 배열 방향 바꾸기
                ddx++;
                ddy = ddy % 4; 
                ddx = ddx % 4;
            }
            number--;
        }
        return answer;
    }
}