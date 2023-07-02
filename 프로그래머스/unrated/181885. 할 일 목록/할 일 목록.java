class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int cnt = 0;
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                cnt++;
            }
        }
        String[] answer = new String[cnt];
        cnt = 0;
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                answer[cnt++] = todo_list[i]; 
            }
        }
        return answer;
    }
}