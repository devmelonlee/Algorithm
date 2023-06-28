class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (Integer i : num_list) {
            while (i > 1) {
                if ((i & 2) == 1) {
                    i = (i - 1) / 2;  
                } else {
                    i /= 2;
                }
                answer++;
            }
            
        }
        return answer;
    }
}