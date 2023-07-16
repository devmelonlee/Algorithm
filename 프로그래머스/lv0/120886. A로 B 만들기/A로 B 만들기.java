import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] bc = before.toCharArray();
        char[] ac = after.toCharArray();
        
        Arrays.sort(bc);
        Arrays.sort(ac);
        
        before = new String(bc);
        after = new String(ac);
        
        return before.equals(after) ? 1 : 0;
    }
}