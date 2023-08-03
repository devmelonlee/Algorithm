import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {     
        ArrayList<String> arr = new ArrayList<>();
        for (String s : strArr) {
            if (!s.contains("ad")) arr.add(s);
        }
        
        String[] answer = new String[arr.size()];
        int cnt = 0;
        for (String s : arr) {
            answer[cnt++] = s;
        }
        
        return answer;
    }
}