package codeUp.sec03;

import java.util.Scanner;

public class P32 {
//10진수 입력받아 16진수로 출력 (소문자)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
//		System.out.printf("%x",a);
		String b = Integer.toHexString(a);
		System.out.println(b);
	}

}
