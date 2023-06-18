class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String str = Integer.toString(x);
        int tmp = 0;
        
        for (int i = 0; i < str.length(); i++) {
            tmp += str.charAt(i) - '0';
        }
        
        if (x % tmp == 0) {
            answer = true;
        }
        
        return answer;
    }
}