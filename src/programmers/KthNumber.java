package programmers;

import java.util.Arrays;

//k번째 수

//class Solution4 {
//    public int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];
//        int num_length=0;
//        
//        for(int i=0;i<commands.length;i++) {
//        	num_length = commands[i][1]-commands[i][0]+1;
//        	int[] num = new int[num_length];
//        	int k=0;
//        	for(int j=commands[i][0]-1;j<commands[i][1];j++) {
//        		num[k]=array[j];
//        		k++;
//        	}
//        	Arrays.sort(num);
//        	answer[i]=num[commands[i][2]-1];
//        }
//        return answer;
//    }
//}

//Arrays.copyOfRange를 사용
class Solution4 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for(int i=0;i<commands.length;i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(temp);
			answer[i]=temp[commands[i][2]-1];
		}
		return answer;
	}
}

public class KthNumber {
	
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		
		System.out.println(Arrays.toString(sol.solution(array, commands)));
	}
}
