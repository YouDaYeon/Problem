package codeUp.sec05;

import java.util.Scanner;

public class P76 {
//문자 1개 입력받아 알파벳 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		char a = 'a';
		
		while(ch>=a) {
			System.out.print(a+" ");
			a++;
		}
	}

}
