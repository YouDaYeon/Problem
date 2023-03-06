package codeUp.sec04;

import java.util.Scanner;

public class P56 {
//참 거짓이 서로 다를때에만 참 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a!=b)
			System.out.println("1");
		else
			System.out.println("0");
	}

}
