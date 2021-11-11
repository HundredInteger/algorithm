/*
1.2차원배열로 주어졌다.-> 가로의길이와 세로의길이때문인듯
2.근데 그냥 가로세로가아니라 회전하여 가로세로를 바꿀 수 있다..
3.그래서 적절한 명함크기를 만들어달라?
4.난 지갑공장을 다니는게 아닌데..

일단 최댓값을 찾아서 그건 무조건 넣어야할듯?

가로 세로 두개의 길이를 비교해서 긴쪽은 가로로가게 하고 짧은쪽은 세로로가게해서
각각의 최댓값을 구해주면 될 것 같다!

2차원 배열 최댓값 검색 -> Math.max이용

*/

import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_a = 0; // a: 가로, b : 세로
        int max_b = 0;
        for(int i=0; i< sizes.length; i++){
            int a = Math.max(sizes[i][0],sizes[i][1]);
            int b = Math.min(sizes[i][0],sizes[i][1]);
            //(a,b)라고한다면 int a 에는 a,b중에 큰값을 b에는 a,b중에 작은 값을 넣어준다.
            max_a = Math.max(max_a,a); // 가로세로 중 큰값 중 젤 큰값
            max_b = Math.max(max_b,b); // 가로세로 중 작은값 중 젤 큰값
            //위에서 max_a와 max_b는 0으로 설정했기때문에 처음에는 max_a = a, max_b = b가 되고
            // 그 이후부터 max_a와 a를 또 비교하여 큰 값이 max_a로 들어가는 방식
        }

        return answer=max_a*max_b;
    }
}

/*
Math.max는 두 개의 숫자를 비교해서 더 큰 숫자를 나타내는 것.

*/

