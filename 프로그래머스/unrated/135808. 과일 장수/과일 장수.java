import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        for (int i = score.length - 1; i >= 0; i -= m) {
            int min = Integer.MAX_VALUE;
            int cnt = 0;
            for (int j = i; j > i - m; j--) {
                if (j == -1) break;
                min = Math.min(min, score[j]);
                cnt++;
            }
            if (cnt != m) break;
            answer += min * m;
        }
        return answer;
    }
}