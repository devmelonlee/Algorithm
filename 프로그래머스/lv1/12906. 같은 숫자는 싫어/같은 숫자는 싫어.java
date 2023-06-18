import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        int tmp = -1;
        
        for (int n : arr) {
            if (tmp != n)
                list.add(n);
            tmp = n;
        }
        
        return list;
    }
}