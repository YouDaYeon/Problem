package codeUp.sec06;

import java.util.Scanner;

public class P79 {
//원하는 문자가 입력될 때까지 반복 출력
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			char ch = sc.next().charAt(0);
			System.out.println(ch);
			if(ch=='q') break;
		}
	}

}
