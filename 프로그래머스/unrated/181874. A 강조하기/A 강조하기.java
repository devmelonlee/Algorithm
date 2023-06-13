class Solution {
    public String solution(String myString) {
        String answer = "";
        answer = myString.toLowerCase();
        answer = answer.toLowerCase().replaceAll("a", "A");;
        return answer;
    }
}