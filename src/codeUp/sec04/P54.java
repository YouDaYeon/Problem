package codeUp.sec04;

import java.util.Scanner;

public class P54 {
//둘 다 참일 경우만 참 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a==1 && b==1)
			System.out.println("1");
		else
			System.out.println("0");
	}

}
