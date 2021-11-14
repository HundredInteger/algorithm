class Solution {
    public long solution(long n) {
        long answer = 0;

        for(long x = 1 ; x <= n ; x++){
            if ( x * x == n ){
                answer = (x+1)*(x+1);
                break;
            }else answer = -1;
        }

        return answer ;
    }
}