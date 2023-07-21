class Solution {
    public String solution(String s) {
        String[] st = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < st.length; i++) {
            max = Math.max(max, Integer.parseInt(st[i]));
            min = Math.min(min, Integer.parseInt(st[i]));
        }
        
        return min + " " + max;
    }
}