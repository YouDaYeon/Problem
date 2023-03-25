package programmers;

import java.util.Arrays;

//제일 작은 수 제거하기

class Solution1 {
    public int[] solution(int[] arr) {
        if(arr.length==1) {
        	int[] answer= {-1};
        	return answer;
        }
        
        //최솟값 인덱스 찾기
        int minIndex=0;
        for(int i=1;i<arr.length;i++) {
    		if(arr[i]<arr[minIndex]) minIndex=i;
    	}
        //최솟값 제거
        int[] answer = new int[arr.length-1];
        int j=0;
        for(int i=0;i<arr.length;i++) {
        	if(i==minIndex) continue;
        	answer[j]=arr[i];
        	j++;
        }
        return answer;
    }
    //제일 작은 수 찾기
    public int minimum(int[] arr) {
    	int num=arr[0];
    	for(int i=1;i<arr.length;i++) {
    		if(arr[i]<num) num=arr[i];
    	}
    	return num;
    }
}
public class Minimum {
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		
		int[] arr= {4,3,1,2};
//		int[] arr = {10};
		System.out.println(Arrays.toString(sol.solution(arr)));
		
	}

}
