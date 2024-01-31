package programers.sequenceAndIntervalsQuery_3;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for(int[] row : queries) {
            int i = row[0];
            int j = row[1];

            int temp = answer[i];
            answer[i] = answer[j];
            answer[j] = temp;
        }
        return answer;
    }
}
