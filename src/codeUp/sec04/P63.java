package codeUp.sec04;

import java.util.Scanner;

public class P63 {
//두 정수 입력받아 큰 수 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

//		if(a>b)
//			System.out.println(a);
//		else
//			System.out.println(b);
		
		System.out.println(a>b? a:b);
	}

}
