class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        int X = max - min + 1;
        while (max < X + min && max > X) {
            answer++; X++;
        }
        while (X < min + max) {
            answer++; X++;
        }
        return answer;
    }
}