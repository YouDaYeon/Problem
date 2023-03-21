package codeUp.sec07;

import java.util.Scanner;

public class P95 {
//이상한 출석번호 부르기3 (n번 출석 부른 후 가장 빠른 번호 출력)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //n번 출석
		int[] num = new int[n];
		
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		int min=num[0];
		for(int i=1;i<num.length;i++) {
			if(num[i]<min) min=num[i];
		}
		System.out.println(min);
	}

}
