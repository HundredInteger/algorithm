class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        if ( a == b) return a;

        for(int i = a>b?b:a;i<=(a>b?a:b);i++) {
            answer+=i;
        }

        return answer;
    }
}
        
/*
        if (a < b){
            for(int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for(int i = b; i <=a; i++) {
                answer += i;
            }
        }return answer ;
    }
}
*/

     
        // 1  3 -> 1+2+3 = 6