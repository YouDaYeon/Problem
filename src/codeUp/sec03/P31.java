package codeUp.sec03;

import java.util.Scanner;

public class P31 {
//10진수를 입력받아 8진수로 출력(%d %o) (toOctalString())
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
//		System.out.printf("%o",i);
		String b = Integer.toOctalString(a);
		System.out.println(b);
	}

}
