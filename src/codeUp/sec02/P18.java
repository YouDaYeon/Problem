package codeUp.sec02;

import java.util.Scanner;

//시간 입력받아 그대로 출력하기
//시(hour)와 분(minute)이 ":"으로 구분
public class P18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		String []b = time.split(":");
		System.out.println(b[0]+":"+b[1]);
	}

}
