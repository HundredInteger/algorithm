class Solution {
    public int[] solution(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int sum = 0;

            while (n != 0) {
                answer[sum] = (int)(n % 10);
                n /= 10;
                sum++;
            }

        return answer;
        return answer;
        return answer;
        return answer;
        return answer;
        return answer;
    }
}
