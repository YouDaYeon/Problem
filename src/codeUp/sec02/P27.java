package codeUp.sec02;

import java.util.Scanner;

public class P27 {
//년월일을 입력받아 형식 바꿔 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		
		String []ymd = date.split("\\.");
		System.out.println(ymd[2]+"-"+ymd[1]+"-"+ymd[0]);
//		System.out.println(date.replaceAll("\\.","-"));
	}
}

