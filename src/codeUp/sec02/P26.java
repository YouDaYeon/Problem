package codeUp.sec02;

import java.util.Scanner;

public class P26 {
//입력된 시:분:초에서 분만 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		
		String []hms = time.split(":");
		System.out.println(Integer.parseInt(hms[1]));
	}
}
