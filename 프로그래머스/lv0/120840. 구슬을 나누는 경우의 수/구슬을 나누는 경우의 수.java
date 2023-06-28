class Solution {
    static int answer;
  
    public int solution(int balls, int share) {
        
        combi(1, balls, share);
        
        return answer;
    }
    
    public static void combi(int start, int num, int depth) {
        if (depth == 0) {
            answer++;
            return;
        }
        for (int i = start; i <= num; i++) {
            combi(i+1, num, depth-1);
        }
    }
    
}