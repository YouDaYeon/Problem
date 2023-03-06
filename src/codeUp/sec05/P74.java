package codeUp.sec05;

import java.util.Scanner;

public class P74 {
//정수 1개 입력받아 카운트다운 출력 1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		while(i>0) {
			System.out.println(i);
			i--;
		}
	}

}
