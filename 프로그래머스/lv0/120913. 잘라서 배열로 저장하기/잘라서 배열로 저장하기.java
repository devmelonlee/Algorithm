import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public String[] solution(String my_str, int n) {        
        ArrayList<String> answer = new ArrayList();
        for (int i = 0; i < (my_str.length() / n); i++) {
            answer.add(my_str.substring((n * i), (n * (i + 1))));
        }
        if (my_str.length() % n != 0) {
             answer.add(my_str.substring( (my_str.length() / n) * n));
        }
        return answer.toArray(new String[0]);
    }
}