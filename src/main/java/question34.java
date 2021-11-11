/*
1번친구 : 1,2,3,4,5 순서대로 (for구문써서 배열의길이만큼 반복?)
2번친구 : 짝수번째 2 홀수번째 1,3,4,5(2제외)
3번친구 : 3,3,1,1,4,4,2,2,5,5 노답
-> 배열에 반복되는 숫자들을 적어놓고, if문을 사용하여 나눈 후 나머지값을 이용하면 될듯?
 */


import java.util.*;

class Solution {
    public int[] solution(int[]answers) {

        int[] answer = {};
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = {0, 0, 0};

        for (int i = 0; i <answers.length; i++) {
            if (one[i % 5] ==answers[i]) scores[0]++;
            if (two[i % 8] ==answers[i]) scores[1]++;
            if (three[i % 10] ==answers[i]) scores[2]++;

        }


        int max = Math.max(Math.max(scores[0], scores[1]), scores[2]);// max값 구하기
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (max == scores[0]) list.add(1);
        if (max == scores[1]) list.add(2);
        if (max == scores[2]) list.add(3);

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}