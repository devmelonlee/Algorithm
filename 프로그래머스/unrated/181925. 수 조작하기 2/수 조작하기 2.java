class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            int tmp = numLog[i] - numLog[i - 1];
            if (tmp == 1) sb.append("w");
            if (tmp == -1) sb.append("s");
            if (tmp == 10) sb.append("d");
            if (tmp == -10) sb.append("a");
        }
        return sb.toString();
    }
}