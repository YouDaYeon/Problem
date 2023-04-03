package programmers;

//소수 만들기
class Solution5 {
    public int solution(int[] nums) {
        int answer = 0;

        int sum=0;
        for(int i=0;i<nums.length;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		for(int k=j+1;k<nums.length;k++) {
        			sum=nums[i]+nums[j]+nums[k];
        			if(check_sosu(sum)==true) answer++;
        		}
        	}
        }
        return answer;
    }
    //소수인지 판단
    //num이 소수일 시 true값 반환
    public boolean check_sosu(int num) {
    	boolean check = true;												
    	
    	for(int i=2;i<num;i++) {
    		if(num%i==0) {
    			check=false;
    			break;
    		}
    	}
		return check;
    }
}

public class PrimeNumber {

	public static void main(String[] args) {
//		int[] nums = {1, 2, 3, 4};
		int[] nums = {1, 2, 7, 6, 4};
		
		Solution5 sol = new Solution5();
		int answer = sol.solution(nums);
		
		System.out.println(answer);
	
	}
}
