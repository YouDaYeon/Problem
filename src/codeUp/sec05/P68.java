package codeUp.sec05;

import java.util.Scanner;

public class P68 {
//정수 1개 입력받아 평가 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A");
		} else if(score>=70) {
			System.out.println("B");
		} else if(score>=40) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}

}
