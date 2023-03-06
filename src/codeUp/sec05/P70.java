package codeUp.sec05;

import java.util.Scanner;

public class P70 {
//월 입력받아 계절 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
			case 12: 
			case 1:
			case 2:
				System.out.println("winter");
				break;
			case 3: 
			case 4:
			case 5:
				System.out.println("spring");
				break;
			case 6: 
			case 7:
			case 8:
				System.out.println("summer");
				break;
			default:
				System.out.println("fall");
				break;
			
		}
	}

}
