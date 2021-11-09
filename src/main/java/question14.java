
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> a = new ArrayList<Integer>(); // divisor로 나누어 떨어지는 값 a에 추가
        //ArrayList : Collections클래스의 sort메서드를 이용하여 저장된 객체들을 정렬가능.
        int[] answer = {};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                a.add(arr[i]); // 만들어진 ArrayLisy에 arr의 값들을 저장
            }
        }
        answer = new int[a.size()];  // a의 size( a 에 들어있는 수수만큼 반환할 배열 answer 생성)-> 현재 a에 ~~~만큼 들어있다.
        if (a.size() == 0) { //divisor로 나누어지는 값 없으면-> a에 아무것도 없으면
            answer = new int[1]; //  -1 들어갈 배열 생성
            answer[0] = -1; // 배열에 -1 추가
        } else { // 나누어 떨어지는 값이 있으면
            for (int i = 0; i < a.size(); i++) { // a의 길이만큼 answer에 a의 값 추가
                answer[i] = a.get(i); //ArrayList a에 있는 값들을 하나씩 꺼내서 answer에 넣어 줌.
            }
        }
        Arrays.sort(answer); // ArrayList의 결과를 출력하는 방법/Arrays.sort(arr,Collections.reverseOrder()); : 내림차순
        return answer;
    }
}


/*        class Divisible {
            public int[] divisible(int[] array, int divisor) {
                //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
                return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray(); //->Arrays.Stream() API
            }*/














        //Q1. 왜 ArrayList를 사용하는가?
        //A1. Collections클래스의 sort메서드를 이용하여 오름차순 정렬을 위해 사용(다른 이유가 더 있을수도 있을 것 같다.)

        //Q2.왜 length대신 size를 사용했냐?
        //A2. array(배열)에서 길이를 나타내주는 건 length arrayList(배열리스트)에서 길이를 나타내 주는 건 size

        //Q3. add와 get을 쓰는 이유
        //A3. add는 ArrayList에서 추가 할 때 사용을 하고 get은 꺼낼 때 사용 한다.

        //

