package programmers;

// 없는 숫자 더하기

//class Solution3 {
//    public int solution(int[] numbers) {
//        int answer = 0;
//        
//        int i,j = 0;
//        for(i=0;i<10;i++) {				//숫자 0~9
//        	int flag = 0;	
//        	for(j=0;j<numbers.length;j++) {
//        		if(i==numbers[j]) {
//        			flag = 1;			//flag==1 -> 숫자 존재
//        			break;
//        		}
//        	}
//        	if(flag==0) answer+=i;		//flag==0 -> 숫자 존재X -> answer에 더해줌
//        }
//        
//        return answer;
//    }
//}

class Solution3{
	public int solution(int[] numbers) {
		int sum = 45;
		for(int i : numbers) {
			sum-=i;
		}
		return sum;
	}
}
public class NoNumber {
	
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		
//		int[] numbers = {1,2,3,4,6,7,8,0};
		int[] numbers = {5,8,4,0,6,7,9};
		System.out.println(sol.solution(numbers));
	}
}
