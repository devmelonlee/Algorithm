class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] fail = new double[N]; // 실패율
        
        // 배열 돌면서 실패한 유저 찾는다.
        int[] tmp = new int[N]; 
        int total = stages.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i + 1) { // 1레벨 실패 
                    tmp[i]++;
                }
            }
            fail[i] = (tmp[i] == 0 ? 0 : tmp[i] / (double) total);
            
            total -= tmp[i];
            answer[i] = i + 1;
        }
        // 순위를 구한다.
        double tmpf = 0.0;
        int tmpa = 1;
        for (int i = 0; i < N; i++){
            for (int j = 1; j < N - i; j++) {
                if (fail[j-1] < fail[j]){  // 가장 작은 수(맨뒤)부터 정렬
                    tmpf = fail[j-1];
                    fail[j-1] = fail[j];
                    fail[j] = tmpf;
                    
                    tmpa = answer[j-1];
                    answer[j-1] = answer[j];
                    answer[j] = tmpa;
                }
            }
        }
        
        return answer;
    }
}