class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(Integer i : array) {
            String str = Integer.toString(i);
            char[] chArr = str.toCharArray();
            for (int j = 0; j < chArr.length; j++) {
                if (chArr[j] == '7')
                    answer++;
            }
        }
        return answer;
    }
}