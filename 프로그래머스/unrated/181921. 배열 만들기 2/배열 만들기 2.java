import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String s = Integer.toString(i);
            boolean valid = true;

            for (char c : s.toCharArray()) {
                if (c != '0' && c != '5') {
                    valid = false;
                    break;
                }
            }
            if (valid) arr.add(i);
        }

        if (arr.size() == 0) {
            int[] answer = {-1};
            return answer;
        }
        
        Collections.sort(arr);
        
        int[] answer = new int[arr.size()];
        int cnt = 0;
        
        for (Integer i : arr) {
            answer[cnt++] = i;
        }
        
        return answer;
    }
}