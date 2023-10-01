import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int weightSum = 0;
        
        if (people.length == 1) return 1;
        
        Arrays.sort(people);
        int start = 0;
        int end = people.length-1;
        while (start <= end){
            if (people[start] + people[end] > limit){
                end--; 
                answer++;
            } else {
                start++;
                end--;
                answer++;
            }
        }
        return answer;
    }
}