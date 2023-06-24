class Solution {
    public long solution(long n) {
        String str = "";
        String tmp = Long.toString(n);
        int[] arr = new int[tmp.length()];
        
        for (int i = 0; i < tmp.length(); i++) {
            String s = tmp.substring(i, i + 1);
            arr[i] = Integer.parseInt(s);
        }
        
        for (int i = 0; i < tmp.length() - 1; i++) {
            for (int j = 0; j < tmp.length() - 1; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        for (int i = 0; i < tmp.length(); i++) {
            str += arr[i];
        }
        
        return Long.parseLong(str);
    }
}