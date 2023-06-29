class Solution {
    public String solution(int[] food) {
        String ans = "";
        for (int i = 1; i < food.length; i++) {
            ans += ("" + i).repeat(food[i] / 2);
        }
        StringBuilder sb = new StringBuilder(ans);
        
        return ans + "0" + sb.reverse().toString();
    }
}