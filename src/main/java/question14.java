import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int[] answer = {};

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % divisor = 0) {
                a.add(arr[i]); // arr의 요소들을 저장
            } if else (a.isEmpty()){
                a.add(-1);
            }
            answer = new int[a.size()];
            for(int i = 0; i < a.size(); i++){
                answer[i] = a.get(i);
            }
            Arrays.sort(answer);
            return answer;
        }

    }
}








