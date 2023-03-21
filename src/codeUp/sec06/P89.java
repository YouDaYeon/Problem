package codeUp.sec06;

import java.util.Scanner;

public class P89 {
//수 나열하기 1 (등차수열)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int sum=a;
		
		for(int i=1;i<n;i++) {
			sum+=d;
		}
		System.out.println(sum);
	}

}
