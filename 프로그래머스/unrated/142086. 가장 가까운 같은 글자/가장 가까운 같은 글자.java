class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] ch = new int[26]; // 알파벳 저장 배열 a = 0, b = 1

        // 알파벳 위치 저장
        for (int i = 0; i < s.length(); i++) {
            if (ch[s.charAt(i) - 'a'] == 0) { // 체크 안되어 있으면
                answer[i] = -1;
                ch[s.charAt(i) - 'a'] = i + 1; // 현재의 위치 + 1 저장
            }
            else { // 새로운 위치 저장하기
                //-> 가까운거 찾기
                answer[i] = i+1 - ch[s.charAt(i) - 'a']; // 현재 위치에서 차이만큼 줄이기
                ch[s.charAt(i) - 'a'] = i+1; // a = 0, 새로운 위치 저장
            }            
        }
        return answer;
    }
}