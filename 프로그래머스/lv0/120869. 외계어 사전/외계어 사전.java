class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for (int i = 0; i < dic.length; i++) {
            boolean[] check = new boolean [spell.length];
            for (int j = 0; j < dic[i].length(); j++) { // 단어
                for (int k = 0; k < spell.length; k++) { // 단어 안의 스펠 체크
                    if (dic[i].charAt(j) == spell[k].charAt(0)) {
                        check[k] = true;
                    }
                }       
            }
            // 단어 순회 후
            int cnt = 0;
            for (boolean b : check) {
                if (b) cnt++;
            }
            if (cnt == spell.length) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}