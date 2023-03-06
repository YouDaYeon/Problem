package codeUp.sec05;

import java.util.Scanner;

public class P69 {
//평가 입력받아 다르게 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char score = sc.next().charAt(0);
		
		switch(score)
		{
		case 'A' :
			System.out.println("best!!!");
			break;
		case 'B' :
			System.out.println("good!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
		default:
			System.out.println("What?");
			break;
		}
	}

}
