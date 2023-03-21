package codeUp.sec07;

import java.util.Scanner;

public class P97 {
//바둑알 십자 뒤집기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] pan = new int[19][19];
		for (int i=0;i<19;i++) {
				pan[i][9]=1;
				pan[9][i]=1;
				pan[i][11]=1;
				pan[11][i]=1;
		}
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int k=0;k<pan.length;k++) {
				if(pan[x-1][k]==1)
					pan[x-1][k]=0;
				else pan[x-1][k]=1;
				if(pan[k][y-1]==1)
					pan[k][y-1]=0;
				else pan[k][y-1]=1;
			}
		}
		for(int i=0;i<19;i++) {
			for(int j=0;j<19;j++) {
				System.out.print(pan[i][j]+" ");
			}
			System.out.println();
		}
	}

}
