package codeUp.sec03;

import java.util.Scanner;

public class P34 {
//8진수로 입력된 정수 1개를 10진수로 바꾸어 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(8);
//		System.out.printf("%d",a);
		
		String a = sc.next();
		int b = Integer.valueOf(a,8);
		System.out.println(b);
	}

}
