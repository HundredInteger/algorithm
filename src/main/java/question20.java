import java.util.*; // java.util.Arrays;만 해도 괜찮음

class Solution {
    public String solution(String[] participant, String[] completion) {

        int i;
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[i];
    }
}


