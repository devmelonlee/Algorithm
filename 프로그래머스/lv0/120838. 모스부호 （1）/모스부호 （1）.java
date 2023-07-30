class Solution {
    public String solution(String letter) {
        String[] m = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
                      ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
                      ".--","-..-","-.--","--.."};
        String[] str = letter.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String word : str) {
            for (int i = 0; i < m.length; i++) {
                if (word.equals(m[i])) sb.append(Character.toString(i + 'a'));
            }
        }
        return sb.toString();
    }
}