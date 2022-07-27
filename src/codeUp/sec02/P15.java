package codeUp.sec02;

import java.util.Scanner;

//둘째 자리까지 출력
public class P15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float f = sc.nextFloat();
		System.out.println(Math.round(f*100)/(float)100);
	}

}
