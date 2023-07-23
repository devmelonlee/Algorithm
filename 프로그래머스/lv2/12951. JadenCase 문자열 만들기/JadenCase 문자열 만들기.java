class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            String st = str[i];
            
            if (str[i].length() == 0) {
                answer += " ";
            } else {
                answer += st.substring(0,1).toUpperCase();
                answer += st.substring(1, st.length()).toLowerCase();
                answer += " ";
            }
        }
        if (s.substring(s.length()-1, s.length()).equals(" ")) return answer;
        return answer.trim();
    }
}