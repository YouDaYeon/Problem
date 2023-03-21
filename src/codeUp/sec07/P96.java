package codeUp.sec07;

import java.util.Scanner;

public class P96 {
//바둑판에 흰 돌 놓기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 흰 돌의 개수
		int[][] pan = new int[19][19]; //19x19 바둑판
		
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			pan[x-1][y-1]=1;
		}
		for(int i=0;i<19;i++) {
			for(int j=0;j<19;j++) {
				System.out.print(pan[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
