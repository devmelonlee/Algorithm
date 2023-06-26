class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int xLen = board[0] / 2;
        int yLen = board[1] / 2;
        int cx = 0;
        int cy = 0;
        
        for (int i = 0; i < keyinput.length; i++) {
            int nx = 0;
            int ny = 0;
            
            if (keyinput[i].equals("up")) {
                nx = cx;
                ny = cy + 1;
            } else if (keyinput[i].equals("down")) {
                nx = cx;
                ny = cy - 1;
            } else if (keyinput[i].equals("left")) {
                nx = cx - 1;
                ny = cy;
            } else if (keyinput[i].equals("right")) {
                nx = cx + 1;
                ny = cy;
            }
            
            if (nx >= -xLen && ny >= -yLen && nx <= xLen && ny <= yLen) {
                cx = nx;
                cy = ny;
            }
        }
        answer[0] = cx;
        answer[1] = cy;
        return answer;
    }
}