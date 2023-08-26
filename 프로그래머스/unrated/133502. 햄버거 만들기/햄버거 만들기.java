class Solution {
    public int solution(int[] ingredient) {
        int[] arr = new int[ingredient.length];
        int answer = 0;
        int cnt = 0;
        
         for (int i : ingredient) {
            arr[cnt] = i;
            cnt++;

            if (cnt >= 4) {
                if (arr[cnt-4] == 1 && arr[cnt-3] == 2 && arr[cnt-2] == 3 && arr[cnt-1] == 1) {
                    cnt -= 4;
                    answer++;
                }
            }
        }
    return answer;
    }
}