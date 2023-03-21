package codeUp.sec06;

import java.util.Scanner;

public class P91 {
//수 나열하기 3 (등차,등비)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		long result=a;
		
		for(int i=0;i<n;i++) {
			result=result*m+d;
		}
		System.out.println(result);
	}

}
