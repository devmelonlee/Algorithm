class Solution {
    public int solution(String myString, String pat) {
        String s = "";
        for (int i = 0; i < myString.length(); i++) {
            if ("A".equals(myString.substring(i, i + 1))) {
                s +="B";
            }
            else 
                s += "A";
        }

        return s.contains(pat) ? 1 : 0;
    }
}