/*
1. 1월 1일이 금요일이니 금-토-일-월-화-수-목 으로 1주일을 계산 돌리면됨.
2.마지막일을 31,29 이런식으로 설정해야하는데 어떻게 하지?
-> j */



class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        String[] year = new String[366];
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int want_day = 0;
        for(int i = 0; i < year.length; i++){
            year[i] = day[i%7];
        }
        for (int i = 0 ; i <a-1; i++){
            want_day += month[i];
        }
        want_day +=b-1;
        answer = year[want_day];
        return answer;
    }
}