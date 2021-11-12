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
        int[] one = {1, 2, 3, 4, 5}; // 1번수포자 반복배열
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = {0, 0, 0};
        //니네 몇 개 맞았냐?(int[] scores = new int[3];)
        for (int i = 0; i <answers.length; i++) {
            if (one[i % 5] ==answers[i]) scores[0]++;
            if (two[i % 8] ==answers[i]) scores[1]++;
            if (three[i % 10] ==answers[i]) scores[2]++;
            //3번의 배열의 수는 10이기때문에 나머지 값을 이용하여 반복이 되게 사용
            //정답의 갯수 만큼 scores[2]가 올라감
        }


        int max = Math.max(Math.max(scores[0], scores[1]), scores[2]);// max값 구하기
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (max == scores[0]) list.add(1);// 리스트 1번째 위치에 값을 추가하는 함수
        if (max == scores[1]) list.add(2);
        if (max == scores[2]) list.add(3);
        // max값이 등록된 scores의 list에 추가
        answer = new int[list.size()]; // answer 를 arraylist배열로 만들어 줌.
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}