package programers.mode;

import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> count = new HashMap<>();
        int answer = 0;

        //test배열 돌면서 hashMap에 엘리먼트별 개수를 키와 값으로 저장
        for(int i=0; i<array.length; i++){
            if(count.get(array[i]) == null | count.isEmpty()) {
                count.put(array[i], 0);
                count.put(array[i], count.get(array[i]) + 1);
            }
            else
                count.put(array[i],count.get(array[i])+1);
        }
        //HashMap 객체 출력
        System.out.println(count);
        List<Integer> valueList = new ArrayList<>(count.values());
        //HashMap의 value를 담은 List 출력
        System.out.println(valueList);

        //넘어온 배열의 엘리먼트가 2개 미만인 경우
        if(valueList.size() < 2)
            answer = array[0];
        else {
            //넘어온 배열의 엘리먼트가 2개 이상인 경우 >> 정렬하여 마지막 인덱스와 그 바로 앞 인덱스 비교(최빈값이 2개인 경우 필터링)
            Collections.sort(valueList);
            if (valueList.get(valueList.size() - 1) == valueList.get(valueList.size() - 2))
                answer = -1;
            else
                for (Map.Entry<Integer, Integer> entry : count.entrySet())
                    if (entry.getValue() == valueList.get(valueList.size() - 1))
                        answer = entry.getKey();
        }
        return answer;
    }
}

class SolutionEx {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4};
        int[] arr2 = {1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4};
        int[] arr3 = {1, 9, 5, 5, 5, 4, 3, 2};
        int[] arr4 = {1};
        Solution sol = new Solution();
        System.out.println(sol.solution(arr3));
    }
}

