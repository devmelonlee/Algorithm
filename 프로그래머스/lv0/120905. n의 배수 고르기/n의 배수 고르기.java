import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n ==0) {
                list.add(numlist[i]);
            }
        }
        
        int[] ans = new int[list.size()];
        int cnt = 0;
        
        for (Integer i : list) {
            ans[cnt++] = i;
        }
        return ans;
    }
}