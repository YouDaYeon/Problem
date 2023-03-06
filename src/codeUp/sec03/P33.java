package codeUp.sec03;

import java.util.Scanner;

public class P33 {
//10진수 입력받아 16진수 출력 (대문자)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
//		System.out.printf("%X",a);
		String b = Integer.toHexString(a).toUpperCase();
		System.out.println(b);
	}

}
