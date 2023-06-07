class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2];
        int cnt = 0;
        
        for(int i = 1; i <= n; i+=2) {
            answer[cnt++] = i;
        }
        
        return answer;
    }
}