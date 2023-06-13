class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if (arr1.length > arr2.length) {
            answer = 1;
        } else if (arr1.length < arr2.length) {
            answer = -1;
        } else if (arr1.length == arr2.length) {
            int x = 0; int y = 0;
            for (Integer i: arr1) {
                x += i;
            }
            for (Integer j : arr2) {
                y += j;
            }
            
            if (x > y) {
                answer = 1;
            } else if (x < y) {
                answer = -1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}