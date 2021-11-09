import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> a = new ArrayList<Integer>(); // divisor로 나누어 떨어지는 값 a에 추가
        int[] answer = {};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                a.add(arr[i]); // arr의 요소들을 저장
            }
            answer = new int[a.size()];  // a의 size(길이보다는 저장공간에 가까움/ a 에 들어있는 수수만큼 반환할 배열 answer 생성)-> 현재 a에 ~~~만큼 들어있다.
            if (a.size() == 0) { //divisor로 나누어지는 값 없으면-> a에 아무것도 없으면
                answer = new int[1]; // -1 값 계속 못 받아서 구글링함 // -1 들어갈 배열 생성
                answer[0] = -1; // 배열에 -1 추가
            } else{ // 나누어 떨어지는 값이 있으면
                for (int j = 0; j < a.size(); j++) { // a의 길이만큼 answer에 a의 값 추가
                    answer[j] = a.get(j);
                }
            }

        } // 배열 정렬
        Arrays.sort(answer);
        return answer;
    }
}


