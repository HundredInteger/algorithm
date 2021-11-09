class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) { // int[][] -> 다차원배열(테이블을 만들어줌)

        //java의 정석 p.225~227 참조
        final int ROW = arr1[0].length; // arr1과 arr2의 길이는 같기 때문에 arr1로만 설정해도 무관
        final int COL = arr1.length; // 오후시간에 발표 -> 어차피 0행의 열길이나 1행의 열길이나 똑같이때문에 0으로 설정/ 근데 왜 하필 0이냐? 어떤 행렬에는 3열0행처럼 0행만 있는 경우도 있을꺼니깐!

        int [][]answer = new int[ROW][COL]; // ROW행 COL열을 가진 answer 2차원 배열 생성
        for(int i = 0 ; i < ROW ; i++){
            for(int j=0 ; j< COL ; j++){

                answer[i][j] += arr1[i][j] + arr2[i][j]; //answer의 i행j열은 arr1의 i행j열과 arr2의 i행j열의 더한 값이다.

            }
        }
        return answer;
    }
}

