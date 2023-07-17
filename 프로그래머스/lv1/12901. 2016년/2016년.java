class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int cnt = 0;
        if (a != 1) {
            for (int i = 1; i < a; i++) {
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10) {
                    cnt += 31;
                } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                    cnt += 30;
                } else 
                    cnt += 29;
            }
        }
        cnt += b;
        return day[cnt % 7 == 0 ? 6 : cnt % 7 - 1];
    }
}