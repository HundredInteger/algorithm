import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = {};

        for(int i=0; i<arr.length ; i++){
         if(arr[i] % divisor == 0) {
             list.add(arr[i]);
         }

         answer = new int[list.size()];
         if(list.size() == 0){
             answer = new int[1];
             answer[0] =-1;
         } else {
             for(int i = 0 ; i<list.size(); i++){
                 answer[i] = list.get(i);
             }
         }

        }
        Arrays.sort(answer);
        return answer;
    }
}