class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int sum = 0;
        for(int i = 0 ; i < n ; i++) {
            while (n != 0) {
                sum == n % 10;
                answer[i] = sum;
                n /= 10;
            }
        }
        return answer;
    }
}
