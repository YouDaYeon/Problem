package codeUp.sec07;

import java.util.Scanner;

public class P99 {
//성실한 개미
//0:갈 수 있는 곳 1:벽 2:먹이
//(2,2)에서 출발
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] path = new int[10][10];
		for(int i=0;i<path.length;i++) {
			for(int j=0;j<path.length;j++) {
				path[i][j]=sc.nextInt();
			}
		}
		//개미 위치
		int x = 1;
		int y = 1;
		
		int flag=0;
		for(int i=x;i<path.length;i++) {
			for(int j=y;j<path.length;j++) {
				if(path[i][j]==0)
					path[i][j]=9;
				else if(path[i][j]==1){
					x++;
					y-=1;
					break;
				}
				else {
					path[i][j]=9;
					flag=1;
					break;
				}
			}
			if(flag==1) break;
		}
		for(int i=0;i<path.length;i++) {
			for(int j=0;j<path.length;j++) {
				System.out.print(path[i][j]+" ");
			}
			System.out.println();
		}
	}

}
