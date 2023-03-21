package codeUp.sec07;

import java.util.Scanner;

public class P94 {
//이상한 출석번호 부르기2 (n번 출석 부른 후 거꾸로 출력)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //n번 출석
		int[] num = new int[n];
		
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=n-1;i>=0;i--) {
			System.out.print(num[i]+" ");
		}
		
	}

}
