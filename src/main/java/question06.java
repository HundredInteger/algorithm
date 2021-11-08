
class Solution {
    public int solution(int[] numbers) {
        int answer = 45;

        for(int i : numbers) { // for(int i = 0; i < numbers.length; i ++ (향상된 for문(for each문) / 자바뽀개기 10강 및 JAVA의 정석 p.166 참조)
            answer -= i ;   //answer -= numbers[i] ;
        }
        return answer;
    }
}











