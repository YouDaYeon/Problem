package codeUp.sec06;

import java.util.Scanner;

public class P85 {
//소리 파일 저장용량 계산
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = sc.nextInt();
		
		double result = ((h*b*c*s)/8)/1024/1024;
		System.out.printf("%.1f MB", result);
	}

}
