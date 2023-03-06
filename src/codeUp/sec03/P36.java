package codeUp.sec03;

import java.util.Scanner;

public class P36 {
//영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		int b = (int)a;
		System.out.println(b);
	}

}
