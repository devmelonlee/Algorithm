import java.util.ArrayList;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList <Integer> bomb = new ArrayList<Integer>();
        
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    bomb.add(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }
        System.out.println(bomb.size());
        while(true) {
            boolean stat = true;
            for (int i = 1; i < bomb.size(); i++) {
                if (bomb.get(i) == bomb.get(i - 1)) {
                    System.out.println("----delete:");
                    System.out.println(bomb.get(i));
                    System.out.println(bomb.get(i-1));
                    System.out.println(bomb.size());
                    System.out.println("xxxxxx:");
                    
                    bomb.remove(i);
                    bomb.remove(i - 1);
                    answer += 2;
                    stat = false;
                    continue;
                }
                // System.out.println(bomb.get(i));
            }
            if (stat) break;
        } 
        return answer;
    }
}