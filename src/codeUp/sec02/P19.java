package codeUp.sec02;

import java.util.Scanner;
import java.util.StringTokenizer;

//연월일 입력받아 그대로 출력
public class P19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ymd = sc.nextLine();
		StringTokenizer st = new StringTokenizer(ymd, ".");
		int[] arr = new int[3];
		int i=0;
		while(st.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		String year = String.format("%04d",arr[0]);
		String month = String.format("%02d",arr[1]);
		String day = String.format("%02d",arr[2]);
		System.out.println(year+"."+month+"."+day);
		
		
	}

}
