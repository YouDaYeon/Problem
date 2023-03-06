package codeUp.sec04;

import java.util.Scanner;

public class P41 {
//영문자 1개를 입력받아 그 다음 문자 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		
		System.out.printf("%c",a+1);
		
	}

}
