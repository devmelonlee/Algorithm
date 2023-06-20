import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        LinkedList<Integer> sam = new LinkedList<Integer>();
        
        while (true) {
            sam.add(n % 3);
            n = n - (n % 3);
            if (n == 0) break;
            n = n / 3;
        }
        
        int cnt = 0;
        for (int i = sam.size() - 1; i >= 0; i--) {
            answer += sam.get(cnt++) * (int)Math.pow(3, i); 
        }
        return answer;
    }
}