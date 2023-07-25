import java.util.Arrays;

class Solution {
    public int solution(int []A, int []B) {
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int answer = 0;
        int cnt = B.length - 1;
        
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[cnt--];
        }

        return answer;
    }
}