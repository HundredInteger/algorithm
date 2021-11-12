/*
1.공백문자를 무시하는 방법

2.짝수번째는 대문자 / 홀수번째는 소문자 -> 그 숫자 그방법으로해야할듯?
 */

class Solution {
    public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }
}