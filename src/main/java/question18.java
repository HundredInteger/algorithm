class Solution {
    public String solution(String[] seoul){
        String answer ="";
        for (int x = 0 ; x<seoul.length; x++) {
            if(seoul[x].equals("Kim")) { // seoul[x] 값에서 Kim이 나오면(숫자가 아닌 문자를 비교 할 땐 equals를 사용.
                answer = "김서방은" + x + "에 있다";
                break; // 오직 한 번만 나타낸다고 했기때문에 찾으면 끝
            }
        }
        return answer;
    }
}


