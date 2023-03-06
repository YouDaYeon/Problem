package codeUp.sec04;

import java.util.Scanner;

public class P64 {
//정수 3개 입력받아 가장 적은 수 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println((a>b? b:a)>c? c:(a>b? b:a));
	}

}
