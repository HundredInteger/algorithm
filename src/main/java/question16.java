class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pSum = 0;
        int ySum = 0;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                pSum += 1;
            } else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                ySum += 1;
            }
        }
         if (pSum != ySum) return false;

        return answer;
    }
}