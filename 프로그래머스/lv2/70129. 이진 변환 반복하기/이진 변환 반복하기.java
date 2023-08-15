class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (s.length() > 1) {
            int cnt = 0;
            // 0 제거하기
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0')
                    answer[1]++;
                else
                    cnt++;
            }
            // 이진법으로 바꾸기
            s = Integer.toBinaryString(cnt);
            answer[0]++;
        }
        
        return answer;
    }
}