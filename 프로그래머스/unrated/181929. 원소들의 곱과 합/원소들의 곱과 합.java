class Solution {
    public int solution(int[] num_list) {
        int times = 1;
        int power = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            times *= num_list[i];
            power += num_list[i];
        }
        return (power * power > times) ? 1 : 0;
    }
}