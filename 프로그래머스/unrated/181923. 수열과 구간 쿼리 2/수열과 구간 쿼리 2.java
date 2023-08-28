import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int k = queries[i][2];

            int a = Integer.MAX_VALUE;

            for (int j = start; j <= end; j++) {
                if (arr[j] > k && arr[j] < a) {
                    a = arr[j];
                }
            }

            if (a != Integer.MAX_VALUE) {
                answer[i] = a;
            }
        }

        return answer;
    }

}