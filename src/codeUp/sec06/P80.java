package codeUp.sec06;

import java.util.Scanner;

public class P80 {
//합이 입력한 정수보다 같거나 작을때까지 더하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		
		for(int i=1;sum<=n;i++) {
			sum+=i;
			if(sum>=n) {
				System.out.println(i);
				break;
			}
		}
	}

}
