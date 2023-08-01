class Solution {
    public int solution(int a, int b) {
        int a1 = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int a2 =  2 * a * b;
        return a1 > a2 ? a1 : a2;
    }
}