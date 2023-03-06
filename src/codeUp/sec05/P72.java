package codeUp.sec05;

import java.util.Scanner;

public class P72 {
//n개의 정수 입력받아 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		
		int i;
		for(i=0;i<num.length;i++)
			num[i] = sc.nextInt();
		for(i=0;i<num.length;i++)
			System.out.println(num[i]);		
	}

}
