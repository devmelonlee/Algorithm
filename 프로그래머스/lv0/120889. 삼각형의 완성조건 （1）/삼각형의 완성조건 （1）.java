class Solution {
    public int solution(int[] sides) {
        int maxValue = 0;
        for (int i = 0; i < 2; i++) {
            if (sides[i] > sides[i+1]) {
                maxValue = sides[i];
                sides[i] = sides[i+1];
                sides[i+1] = maxValue;
            }
        }
        return (sides[0] + sides[1] < sides[2] + 1) ? 2 : 1;
    }
}