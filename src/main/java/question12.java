/*
1. 시작값 : price
2. 늘어나는값 : count (price * count)-> for구문 돌려서 i가 늘어날때마다 카운트 늘어나서 하면될듯
3. 현재 가진 돈 : money니깐 저 2번에서 3번을 빼면 모자라는 값이 나옴
 */


class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long result = 0;

        for(int i = 0 ; i < count ; i++){
            result += (long) price * (i+1) ;
        }
        if((long) money > result){
            answer = 0 ;
        } else {
            answer = result - money ; }
        return answer;
    }
}