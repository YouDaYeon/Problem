package programmers;

import java.util.ArrayList;

//소수 만들기
class Solution {
	public int solution(int[] nums)
	{
		//3개의 수 더하기
		int sosuNum = 0;
		for(int i=0; i<nums.length-2; i++) {
			for(int j=i+1; j<nums.length-1; j++) {
				for(int k=j+1; k<nums.length; k++) {
					int num = nums[i]+nums[j]+nums[k];
					if(check_sosu(num)==true) sosuNum++;  
				}
			}
		}
		return sosuNum;
	}
	//소수체크
	public boolean check_sosu(int n)
	{
		boolean check = true;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				check = false;
				break;
			}
		}
		return check;
	}
}
public class PrimeNumber {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		
		Solution sol = new Solution();
		int answer = sol.solution(nums);
		
		System.out.println(answer);
	
	}
}
