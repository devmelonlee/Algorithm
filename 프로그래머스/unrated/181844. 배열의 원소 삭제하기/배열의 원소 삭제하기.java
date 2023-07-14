class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    arr[i] = 0;
                    cnt++;
                }
            }
        }
        int[] answer = new int[arr.length - cnt];
        int cntcnt = 0;
        for (Integer i : arr) {
            if (i != 0) answer[cntcnt++] = i;
        }
        
        return answer;
    }
}