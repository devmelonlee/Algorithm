class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j])
                    answer[i]++; // 가장 높은 순위는 ++ 되지 못함, 낮은 순위만 ++이 많아진다.
            }
            answer[i]++; // 처음에 0으로 초기화 되어있으므로
        }
        return answer;
    }
}