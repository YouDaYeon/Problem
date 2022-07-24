package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Plus {

	public static void main(String[] args) {
	    int[] numbers = {2, 1, 3, 4, 1}; // 주어짐
	    		
		ArrayList<Integer> result = new ArrayList();
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				int r = numbers[i]+numbers[j];
				if(!result.contains(r)) result.add(r);
			}
		}
//		System.out.println(result);
		
		int[] answer = new int[result.size()];
		for(int i=0;i<answer.length;i++)
		{
			answer[i]=result.get(i);
		}
		
		Arrays.sort(answer);
		
		System.out.println(Arrays.toString(answer));
	}

}
