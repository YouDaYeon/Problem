package codeUp.sec05;

import java.util.Scanner;

public class P77 {
//정수 1개 입력받아 그 수까지 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		while (n>=i) {
			System.out.println(i);
			i++;
		}
	}

}
