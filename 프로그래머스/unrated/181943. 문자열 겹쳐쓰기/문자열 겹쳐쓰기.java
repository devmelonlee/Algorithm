class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String tmp1 = "";
        String tmp2 = "";

        tmp1 = my_string.substring(0, s);
        tmp2 = my_string.substring(s + overwrite_string.length());
        
        return tmp1 + overwrite_string + tmp2;
    }
}