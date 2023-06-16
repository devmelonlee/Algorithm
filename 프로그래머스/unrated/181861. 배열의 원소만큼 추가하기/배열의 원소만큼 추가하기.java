class Solution {
    public int[] solution(int[] arr) {
        int total = 0;
        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        
        int[] answer = new int[total];
        int ansCnt = 0;
        int cnt2 = 0;
        for (int i = 0; i < arr.length; i++) {    
            for (int j = 0; j < arr[cnt2]; j++) {
                answer[ansCnt++] = arr[cnt2];
            }
            cnt2++;
        }
        return answer;
    }
}