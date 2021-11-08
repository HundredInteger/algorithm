class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {


        final int ROW = arr1.length;
        final int COL = arr1[0].length;

        int [][]answer = new int[ROW][COL];
        for(int i = 0 ; i < ROW ; i++){
            for(int j=0 ; j< COL ; j++){

                answer[i][j] += arr1[i][j] + arr2[i][j];


            }
        }
        return answer;
    }
}