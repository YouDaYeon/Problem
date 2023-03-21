package codeUp.sec06;

import java.util.Scanner;

public class P82 {
//16진수끼리 곱하는 16진수 구구단
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt(16);
		
		for(int i=1;i<16;i++) {
			System.out.printf("%X*%X=%X\n",num,i,num*i);
		}
	}

}
