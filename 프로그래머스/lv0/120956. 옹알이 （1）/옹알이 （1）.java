class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for (String i : babbling) {
            i = i.replaceFirst("aya", "0");
            i = i.replaceFirst("woo", "0");
            i = i.replaceFirst("ye", "0");
            i = i.replaceFirst("ma", "0");
            i = i.replace("0", "");
            
            if (i.equals("")) answer++;
        }
        
        return answer;
    }
}