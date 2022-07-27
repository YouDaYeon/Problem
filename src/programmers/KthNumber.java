package programmers;

import java.util.Arrays;

//k번째 수
class Solution {
	public int[] solution(int[]array, int[][] commands) {
		int[] answer = new int[commands.length];
		for(int i=0; i<commands.length; i++) {
			int[] newArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(newArray);
			answer[i] = newArray[commands[i][2]-1];
		}
		return answer;
	}
}
//class Solution {
//    public int[] solution(int[] array, int[][] commands) {
//    	
//    	int[] answer = new int[commands.length];
//    	for(int i=0; i<commands.length; i++) {
//    		answer[i] = findKthNum(array, commands[i][0],commands[i][1],commands[i][2]);
//    	}
//    	return answer;
//    }
//    
//    int findKthNum(int[] array, int i, int k, int j) {
//    	int kthNum = 0;
//    	int[] newArray = new int[k-i+1];
//    	int index=0;
//    	for(int t=i-1; t<k; t++) {
//    		newArray[index]=array[t];
//    		index++;
//    	}
//    	Arrays.sort(newArray);
//    	kthNum = newArray[j-1];
//    	
//    	return kthNum;
//    }
//}
public class KthNumber {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		Solution sol = new Solution();
		
		int[] answer = new int[commands.length];
		answer = sol.solution(array, commands);
		System.out.println(Arrays.toString(answer));
		
	}

}
