package codeUp.sec02;

import java.util.Scanner;

//주민번호 입력받아 형태 바꿔 출력
public class P20 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String id = sc.nextLine();
		
		//Substring
		String front = id.substring(0,6);
		String end = id.substring(7);
		System.out.println(front + end);
		
		System.out.println();
		//Split
		String[] number = id.split("-");
		for(int i=0; i<number.length; i++)
			System.out.print(number[i]);
	}

}
