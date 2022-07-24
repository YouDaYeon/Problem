package programmers;

import java.util.ArrayList;
import java.util.Arrays;

//제일 작은 수 제거하기
class Solution {
	public int[] solution(int[] arr) {
		
		if(arr.length == 1) {
			int[] answer = {-1};
			return answer;
		}
		
		//최솟값 index 구하기
		int minIndex = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<arr[minIndex]) {
				minIndex = i;
			}
		}
		//answer 구하기
		int[] answer = new int[arr.length-1];
		
		for(int i=0; i<arr.length; i++) {
			if(i==minIndex) continue;
			answer[i] = arr[i];
		}
		
		return answer;
	}
}
public class Minimum {

	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 1};
		
		Solution sol = new Solution();
		System.out.println(Arrays.toString(sol.solution(arr)));
	}

}
