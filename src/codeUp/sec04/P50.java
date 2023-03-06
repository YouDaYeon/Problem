package codeUp.sec04;

import java.util.Scanner;

public class P50 {
//두 정수 입력받아 비교 2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a==b)
			System.out.println("1");
		else
			System.out.println("0");
	}

}
