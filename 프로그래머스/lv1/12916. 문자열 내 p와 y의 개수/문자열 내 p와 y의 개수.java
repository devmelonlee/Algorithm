class Solution {
    boolean solution(String s) {
        int cntY = 0;
        int cntP = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'y' ||s.charAt(i) == 'Y')
                cntY++;
            if (s.charAt(i) == 'p' ||s.charAt(i) == 'P')
                cntP++;
        }

        return cntY == cntP ? true : false;
    }
}