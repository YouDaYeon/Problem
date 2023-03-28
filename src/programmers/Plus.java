package programmers;

import java.util.ArrayList;
import java.util.Arrays;
//두 개 뽑아서 더하기
class Solution2 {
    public int[] solution(int[] numbers) {
        ArrayList result = new ArrayList();
        int sum;
        
        for(int i=0;i<numbers.length;i++) {
        	for(int j=i+1;j<numbers.length;j++) {
        		sum = numbers[i]+numbers[j];
        		if(!result.contains(sum)) result.add(sum); // 중복되지않게 리스트에 수 추가
        	}
        }

        int[] answer = new int[result.size()];
        for(int i=0;i<answer.length;i++) {		// 리스트 -> 정수 배열
        	answer[i]=(int)result.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}

public class Plus {
	public static void main(String[] args) {
	    Solution2 sol = new Solution2();
	    
//	    int[] numbers = {2,1,3,4,1};
	    int[] numbers = {5,0,2,7};
	   
	    System.out.println(Arrays.toString(sol.solution(numbers)));
	}
}