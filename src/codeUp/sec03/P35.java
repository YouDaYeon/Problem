package codeUp.sec03;

import java.util.Scanner;

public class P35 {
//16진수로 입력된 정수 1개를 8진수로 바꾸어 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(16);
//		System.out.printf("%o",a);
		
		String a = sc.next();
		int b = Integer.valueOf(a,16);
		String c = Integer.toOctalString(b);
		System.out.println(c);
	}

}
