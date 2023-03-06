package codeUp.sec04;

import java.util.Scanner;

public class P45 {
//정수 a,b 합,차,곱,몫,나머지,나눈 값 계산
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.printf("%.2f",(float)a/b);
	}

}
