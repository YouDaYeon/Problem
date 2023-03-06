package codeUp.sec05;

import java.util.Scanner;

public class P65 {
//정수 3개 입력받아 짝수만 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a%2==0) System.out.println(a);
		if (b%2==0) System.out.println(b);
		if (c%2==0) System.out.println(c);
	}

}
