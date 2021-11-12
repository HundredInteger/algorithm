/*
1.문자열을 숫자로 바꿔준다? replace?
->replace([기존문자],[바꿀문자])
2.문자열은 어떻게 표현? -> 배열로해서 하나씩나타나게해야하나?
->문자열 포함 검색 -> contains를 이용
 */


class Solution {
    public int solution(String s) {

        String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i =0 ; i<10 ; i++){
            if(s.contains(word[i])) {  // 문자로 표현 된 값이 있으면

                s = s.replace(word[i], Integer.toString(i));  //s가 string이기때문에 지정 된 정수를 나타내는 string객체로 리턴해주는 Integer.toString 사용(하단참조)

            }
        }
        int answer = Integer.parseInt(s); // 문자열 -> 숫자 변환

        return answer;
    }
}


/*
Integer.toString : http://cris.joongbu.ac.kr/course/java/api/java/lang/Integer.html#toString(int)

 */