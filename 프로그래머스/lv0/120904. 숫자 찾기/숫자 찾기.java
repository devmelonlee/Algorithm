class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str = Integer.toString(num);
        
        for (int i = 0; i < str.length(); i++) {
           if ((char) (k + '0') == str.charAt(i)) {
               answer = i + 1;
               break;
           } 
        }
        return answer;
    }
}