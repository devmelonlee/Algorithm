class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        if (myString.toLowerCase().contains(pat.toLowerCase()) || myString.toUpperCase().contains(pat.toUpperCase())) 
            answer = 1;
        return answer;
    }
}