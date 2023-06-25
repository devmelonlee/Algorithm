import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> str = new ArrayList<>();
        
        for (int i = 0; i < names.length; i += 5) {
            str.add(names[i]);
        }
        
        String[] answer = new String[str.size()];
        int cnt = 0;
        
        for (String s : str) {
            answer[cnt++] = s;
        }
                   
        return answer;
    }
}