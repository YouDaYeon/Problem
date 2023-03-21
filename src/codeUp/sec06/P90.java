package codeUp.sec06;

import java.util.Scanner;

public class P90 {
//수 나열하기 2 (등비수열)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		long result=a;
		
		for(int i=0;i<n;i++) {
			result*=r;
		}
		System.out.println(result);
	}

}
