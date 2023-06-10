class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = 0;
        
        while (true) {
            int sum = 0;
            for (int i = start; i < start + num; i++) {
                sum += i;
            }
            if (sum < total) {
                start++;
            }
            else if (sum > total) {
                start--;
            }
            else {
                int cnt = 0;
                for (int i = start; i < start + num; i++) {
                    answer[cnt++] = i;
                }
                break;
            }  
        }
        return answer;
    }
}