/*정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.


1.if문을 사용하여 배열 값이 0인 경우 1개 생성하여 그 값을 -1로 설정(question10번에서 사용한대로)
2.가장 작은 원소를 찾아서 제거... -> java 원소 제거 검색 -> Arraylist 사용 -> remove 메서드로 사용
출처 : https://ko.myservername.com/remove-delete-an-element-from-an-array-java

*/
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> idx = new ArrayList<Integer>(); // 배열에서 바로 삭제가 안됨으로 arraylist생성
        int min = 0; // 첫번째 값이 일단 무조건 제일 작은 값이라고 가정

        if(arr.length == 1) {
            int[] answer ={-1};
            return answer;
        } // 배열의 길이가 1이면 (최소값제외하면 0) -1을 넣어줌

        for(int i=0; i<arr.length; i++) { // 배열원소를 arrayList에 넣어줌
            idx.add(arr[i]);
        }

        for(int i=1; i<arr.length; i++) {
            if(arr[min] > arr[i]) { //현재 최소값을 갖고 있는 배열의 값보다 i의 값이 더 작다면
                min = i; // min에 가장 작은 값의 인덱스를 넣어줌
            }
        }
        idx.remove(min); // 해당 인덱스를 가진 원소를 제거
        answer = new int[idx.size()];
        for(int i=0; i<idx.size(); i++) { // 다시 배열에 넣어줌
            answer[i] = idx.get(i);
        }
        return answer;
    }
}





//다른정답

/*        import java.util.Arrays;
        import java.util.stream.Stream;
        import java.util.List;
        import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[]{ -1 };
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}*/

//ArrayList를 사용하지 않고 쓰는 방법

/*
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length-1];
        int minIndex=0;

        for(int i=0;i<arr.length;i++){
            if(arr[minIndex]>arr[i]){
                minIndex = i;
            }
        }
        for(int i=minIndex+1;i<arr.length;i++){
            arr[i-1] = arr[i];  // 1번째값이 이제 0번째값이 되는것!
        }
        for(int i=0;i<answer.length;i++){
            answer[i] = arr[i]; // 위에서 answer의 배열값도 -1해줬고, arr의 배열값도 for구문을 통해 -1해줬으니 배열의 길이는 동일하고 arr을 통해최소값제거
        }
        return answer;
    }
}
*/
