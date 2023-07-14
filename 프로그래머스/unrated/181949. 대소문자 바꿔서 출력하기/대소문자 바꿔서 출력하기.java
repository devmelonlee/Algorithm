import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder sb = new StringBuilder();
        
        for (char ch : a.toCharArray()) {
            if ('A' <= ch && ch <= 'Z') {
                ch += 32;
                sb.append(ch);
            }
            else if ('a' <= ch && ch <= 'z') {
                ch -= 32;
                sb.append(ch);
            }     
        }
        System.out.print(sb.toString());
    }
}