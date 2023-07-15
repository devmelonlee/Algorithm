import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] dist = new double[numlist.length];
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] - n < 0) // 거리 음수, 뒤로 밀리게 
                dist[i] = ((int)Math.abs(numlist[i] - n)) + 0.5;
            else // 거리 양수
                dist[i] = numlist[i] - n;
        }
        
        Arrays.sort(dist);
        
        for (int i = 0; i < numlist.length; i++) {
            if (dist[i] % 1 == 0) // 거리 양수
                answer[i] = (int) dist[i] + n;
            else // 거리 음수
                answer[i] = n - (int) dist[i];
                
        }
        return answer;
    }
}