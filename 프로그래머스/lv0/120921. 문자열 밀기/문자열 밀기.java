class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        String s = A;
        for (int i = 0; i < A.length(); i++) {
            if (s.equals(B)) {
                return answer;
            }
            String s2 = s.substring(s.length()-1);
            s = s2 + s.substring(0, s.length()-1);
            answer++;
        }
        return -1;
    }
}