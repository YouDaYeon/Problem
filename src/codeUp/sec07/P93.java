package codeUp.sec07;

import java.util.Scanner;

public class P93 {
//이상한 출석번호 부르기1 (n번 출석 부른 후 몇 번 불렸는지 출력)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //n번 출석
		int[] num = new int[23]; //num[0]~num[22] 총 23개
		
		for (int i=0;i<n;i++) {
			int a = sc.nextInt(); //랜덤으로 불린 수
			num[a-1]++;
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
	}

}
