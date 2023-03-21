package codeUp.sec06;

import java.util.Scanner;

public class P92 {
//함께 문제 푸는 날(최소공배수)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int day=1;
		
		while(s1%day!=0 || s2%day!=0 || s3%day!=0) {
			day++;
		}
		System.out.println(day);
		
	}

}
