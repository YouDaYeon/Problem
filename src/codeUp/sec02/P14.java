package codeUp.sec02;

import java.util.Scanner;

//문자 2개 입력받아 순서 바꿔 출력하기
public class P14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char x = sc.next().charAt(0);
		char y = sc.next().charAt(0);
		System.out.println(y+" "+x);
	}

}
