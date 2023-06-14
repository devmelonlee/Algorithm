class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int cnt = 0;
        for (int i = a; i < a + d * included.length; i += d) {
            if (included[cnt++]) answer += i;
        }
        return answer;
    }
}