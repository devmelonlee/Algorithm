class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if (code.charAt(i) != '1' && i % 2 == 0) 
                    sb.append(code.charAt(i));
                if (code.charAt(i) == '1') 
                    mode = 1;
            }
            
            else if (mode == 1) {
                 if (code.charAt(i) != '1' && i % 2 == 1) 
                    sb.append(code.charAt(i));
                 if (code.charAt(i) == '1')
                    mode =  0;
            }
        }
        if (sb.length() == 0) {
            sb.append("EMPTY");
        }
        
        return sb.toString();
    }
}