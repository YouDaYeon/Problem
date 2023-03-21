package codeUp.sec06;

import java.util.Scanner;

public class P88 {
//3의 배수는 통과 1~n까지 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(i%3==0) continue;
			System.out.print(i+" ");
		}
	}

}
