package codeUp.sec05;

import java.util.Scanner;

public class P73 {
//0 입력될 때까지 무한출력2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			if(a!=0) {
				System.out.println(a);
			}else
				break;
		}
	}

}
