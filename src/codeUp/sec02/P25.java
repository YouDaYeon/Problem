package codeUp.sec02;

import java.util.Scanner;

public class P25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int mill = (num/10000)*10000;
		int thou = (num/1000%10)*1000;
		int hund = (num/100%10)*100;
		int ten = (num/10%10)*10;
		int one = (num%10);
		System.out.println("["+mill+"]");
		System.out.println("["+thou+"]");
		System.out.println("["+hund+"]");
		System.out.println("["+ten+"]");
		System.out.println("["+one+"]");
		
		
	}

}
