import java.util.*;

class Solution {
    public int[] solution(int n) {       
        ArrayList <Integer> arr = new ArrayList <Integer>();
        
        arr.add(n);
        while (n > 1) {
            if (n % 2 == 0) n /= 2;
            else n = 3 * n + 1;
            arr.add(n);
        }
        int[] answer = new int[arr.size()];
        int cnt = 0;
        for (Integer i : arr) {
            answer[cnt++] = i;
        }
        return answer;
    }
}