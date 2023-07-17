class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                sb.append("" + (char)((s.charAt(i) - 'A' + n) % 26 + 'A'));
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                sb.append("" + (char)((s.charAt(i) - 'a' + n) % 26 + 'a'));
            }
            else {
                sb.append("" + s.charAt(i));
            }
        }
        return sb.toString();
    }
}