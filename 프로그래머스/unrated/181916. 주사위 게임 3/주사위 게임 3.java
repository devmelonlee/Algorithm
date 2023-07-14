class Solution {
    public int solution(int a, int b, int c, int d) {
        if (a == b && b == c && c == d) 
            return 1111 * d;
        
        else if (a == b && b == c) 
            return (int) Math.pow(10 * a + d, 2);
        else if (a == b && b == d) 
            return (int) Math.pow(10 * a + c, 2);
        else if (a == c && c == d) 
            return (int) Math.pow(10 * a + b, 2);
        else if (b == c && c == d) 
            return (int) Math.pow(10 * b + a, 2);
        
        else if (a == b && c == d)
            return (a + c) * Math.abs(a - c);
        else if (b == c && d == a)
            return (b + d) * Math.abs(b - d);
        else if (a == c && b == d)
            return (a + b) * Math.abs(a - b);
        
        else if (a == b)
            return c * d;
        else if (a == c)
            return b * d;
        else if (b == c)
            return a * d;
        else if (a == d)
            return b * c;
        else if (c == d)
            return a * b;
        else if (b == d)
            return a * c;
        
        else {
            int min = Math.min(a, b);
            min = Math.min(min, c);
            min = Math.min(min, d);
            return min;
        }

    }
}