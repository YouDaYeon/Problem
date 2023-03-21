package codeUp.sec07;

import java.util.Scanner;

public class P98 {
//설탕과자 뽑기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); //격자판 h X w
		int w = sc.nextInt();
		int[][] pan = new int[h][w];
		int n = sc.nextInt(); //막대의 개수
		
		for(int i=0;i<n;i++) {
			int l = sc.nextInt(); //막대 길이(l)
			int d = sc.nextInt(); //막대 방향(d)
			int x = sc.nextInt(); //막대 좌표(x,y)
			int y = sc.nextInt(); 
			
			if(d==0) {
				for(int j=0;j<l;j++) {
					pan[x-1][y-1+j]=1;
				}
			}
			else {
				for(int j=0;j<l;j++) {
					pan[x-1+j][y-1]=1;
				}
			}			
		}
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				System.out.print(pan[i][j]+" ");
			}
			System.out.println();
		}
	}

}
