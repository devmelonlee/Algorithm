class Solution {
    public int solution(String s) {
        String ans = "";
        int i = 0;
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) { // 숫자 라면
                ans += s.charAt(i); i++;
            } else {
                String check = s.substring(i,i+2);
                System.out.println(check);
                if (check.equals("ze")) { // 4
                    ans += "0"; i+=4;
                } else if (check.equals("on")) { // 3
                    ans += "1"; i+=3;
                } else if (check.equals("tw")) { // 3
                    ans += "2"; i+=3;
                } else if (check.equals("th")) { // 5
                    ans += "3"; i+=5;
                } else if (check.equals("fo")) { // 4
                    ans += "4"; i+=4;
                } else if (check.equals("fi")) { // 4
                    ans += "5"; i+=4;
                } else if (check.equals("si")) { // 3
                    ans += "6"; i+=3;
                } else if (check.equals("se")) { // 5
                    ans += "7"; i+=5;
                } else if (check.equals("ei")) { // 5
                    ans += "8"; i+=5;
                } else if (check.equals("ni")) { // 4
                    ans += "9"; i+=4;
                }
            }
        }
        return Integer.parseInt(ans);
    }
}