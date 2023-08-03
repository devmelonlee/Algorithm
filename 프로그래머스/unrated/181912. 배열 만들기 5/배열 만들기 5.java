import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList <Integer> ans = new ArrayList<>();
        for(String str : intStrs) {
            int tmp = Integer.parseInt(str.substring(s, s + l));
            if (tmp > k) ans.add(tmp);
        }
        int[] answer = new int[ans.size()];
        int cnt = 0;
        
        for (Integer i : ans) {
            answer[cnt++] = i;
        }
        
        return answer;
    }
}