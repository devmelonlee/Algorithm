class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        int anscnt = 0;
        
        while (answer == -1) {
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    cnt++;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = (arr[i] * 2) + 1;
                    cnt++;
                }               
            }
            anscnt++;
            if (cnt == 0) answer = anscnt;
        }
        
       
        
        return answer - 1;
    }
}