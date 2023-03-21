package codeUp.sec06;

import java.util.Scanner;

public class P78 {
//짝수 합 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		
		for(int i=0;i<=n;i++) {
			if(i%2==0)
				sum+=i;
		}
		System.out.println(sum);
	}

}
