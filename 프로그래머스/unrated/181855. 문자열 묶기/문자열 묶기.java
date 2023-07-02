class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int cntArr[] = new int[31];
        for (int i = 0; i < strArr.length; i++) {
            cntArr[strArr[i].length()]++;
        }
        for (int i = 0; i < 31; i++) {
            answer = Math.max(answer, cntArr[i]);
        }
        return answer;
    }
}