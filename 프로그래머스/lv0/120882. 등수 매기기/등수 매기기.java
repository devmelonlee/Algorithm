class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        float[] avg = new float[score.length];
        
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < 2; j++) {
                avg[i] = (score[i][0] + score[i][1]) / 2f;
            }
        }
        for (int i = 0; i < avg.length; i++) {
            for (int j = 0; j < avg.length; j++) {
                if (avg[i] < avg[j])
                    answer[i]++;
            }
            answer[i]++;
        }
        return answer;
    }
}