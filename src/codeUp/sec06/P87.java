package codeUp.sec06;

import java.util.Scanner;

public class P87 {
//1부터 n까지 정수를 계속 더할 때, 입력한 정수보다 작을 동안만 계속 더하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		
		for(int i=1;sum<=num;i++) {
			sum+=i;
			if(sum>=num) {
				System.out.println(sum);
				break;
			}
		}
	}

}
