class Solution {
    public int solution(int a, int b) {
        int X = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int Y = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        return X > Y ? X : Y;
    }
}