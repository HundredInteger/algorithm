import java.util.Arrays;

public class Main {
    public static int[][] solution(int[][] arr1, int[][] arr2, boolean[][] signs) {


        final int ROW = arr1.length;
        final int COL = arr1[0].length;
        int[][] result = new int [ROW][COL];

        for(int i= 0 ; i < ROW ; i++){
            for(int j = 0 ; j < COL; j++) {
                result[i][j] += arr1[i][j] + arr2[i][j];
                if(!signs[i][j]){
                    result[i][j] *= -1;
                }


            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[][] A = { { 5, 7, 1 }, { 2, 3 , 5}};
        int[][] B = { { 5, 1, 6 }, { 7, 5 , 6}};
        boolean[][] C = { {true,true,false}, {false,true,false}};
        System.out.println(Arrays.deepToString(solution(A,B,C)));
    }
}