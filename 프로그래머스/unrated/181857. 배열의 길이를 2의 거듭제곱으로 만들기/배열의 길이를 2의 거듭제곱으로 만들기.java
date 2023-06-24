class Solution {
    public int[] solution(int[] arr) {
        int len = 1;
        for (int i = 0; i <= 10; i++) {
            if (arr.length > (int) Math.pow(2, i)){
                len = (int) Math.pow(2, i+1);
            }
        }
        
        int[] answer = new int[len];
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        if (arr.length < len) {
            for (int i = arr.length; i < len; i++) {
                answer[i] = 0;
            }   
        }
        
        return answer;
    }
}