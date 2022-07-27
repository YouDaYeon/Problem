package codeUp.sec02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class P23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		StringTokenizer st = new StringTokenizer(num,".");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
	}

}
