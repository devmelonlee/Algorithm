class Solution {
    static final int[] dy = { -1, 0, +1, 0 };
    static final int[] dx = { 0, +1, 0, -1 };
    
    public int[] solution(String[] park, String[] routes) {
        int y = park.length;
        int x = park[0].length();
        char[][] map = new char[y][x];
        
        int cy = 0;
        int cx = 0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                map[i][j] = park[i].charAt(j);
                if (map[i][j] == 'S') {
                    cy = i;
                    cx = j;
                }
            }
        }
        
        for (int i = 0; i < routes.length; i++) {
            int dir = 0;
            switch (routes[i].charAt(0)) {
            case 'N' :
                dir = 0; break;
            case 'E' :
                dir = 1; break;
            case 'S' :
                dir = 2; break;
            case 'W' :
                dir = 3; break;
            }
            
            int ny = 0;
            int nx = 0;
            int tempY = cy;
            int tempX = cx;
            for (int j = 0; j < routes[i].charAt(2) - '0'; j++) {
                ny = cy + dy[dir];
                nx = cx + dx[dir];
                if (ny < 0 || nx < 0 || ny >= y || nx >= x) {
                    cy = tempY; cx = tempX;
                    break;
                }
                if (map[ny][nx] == 'X') {
                    cy = tempY; cx = tempX;
                    break;  
                } 
                
                cy = ny; cx = nx;
            }
            if (ny < 0 || nx < 0 || ny >= y || nx >= x) continue;
            if (map[ny][nx] == 'X') continue;
        }
        int[] answer = {cy, cx};
        return answer;
    }
}