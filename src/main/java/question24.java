
import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String num = String.valueOf(n); //String형으로 변환
        String ansnum = "";
        char[] arr = new char[num.length()];
        for (int i = 0; i < num.length(); i++) {
            arr[i] += num.charAt(i); //문자열을 char형으로 변환
        }
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            ansnum += arr[i];
        }

        long answer = Long.parseLong(ansnum);
        return answer;
    }
}
