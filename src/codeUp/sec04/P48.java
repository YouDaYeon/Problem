package codeUp.sec04;

import java.util.Scanner;

public class P48 {
//한 번에 2의 거듭제곱 배로 출력
//a를 2^b배 곱한 값
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a<<b);
	}

}
