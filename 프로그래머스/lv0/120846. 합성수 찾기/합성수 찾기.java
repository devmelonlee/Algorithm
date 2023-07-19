class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 2; j <= i; j++) {
                cnt += (i % j == 0) ? 1: 0;
            }
            answer += (cnt >= 2) ? 1 : 0;
        }
        return answer;
    }
}