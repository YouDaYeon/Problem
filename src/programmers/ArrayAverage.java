package programmers;

import java.util.Arrays;

//배열의 평균값
//class Solution7 {
//    public double solution(int[] numbers) {
//        double answer = 0, sum=0;
//        for(int i:numbers) {			// for each 구문
//        	sum+=i;
//        }
//        answer=sum/numbers.length;
//        return answer;
//    }
//}
class Solution7 {
	public double solution(int[] numbers) {
		return Arrays.stream(numbers).average().orElse(0);
	}
}
public class ArrayAverage {

	public static void main(String[] args) {
		Solution7 sol=new Solution7();
		int[] numbers= {1,2,3,4,5,6,7,8,9,10};
//		int[] numbers= {89,90,91,92,93,94,95,96,97,98,99};
		
		System.out.println(sol.solution(numbers));
		}	
}
