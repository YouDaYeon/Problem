package codeUp.sec06;

import java.util.Scanner;

public class P86 {
//그림 파일 저장용량 계산
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int b = sc.nextInt();
		
		double result = ((w*h*b)/8)/1024/1024;
		System.out.printf("%.2f MB", result);
	}

}
