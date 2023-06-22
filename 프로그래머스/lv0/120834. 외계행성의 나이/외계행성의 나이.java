class Solution {
    public String solution(int age) {
        String answer = "";
        char[] ch = ("" + age).toCharArray();
        for (int i = 0; i < ch.length; i++) {
            answer += ("" + (char)(ch[i] + 49));
        }
        return answer;
    }
}