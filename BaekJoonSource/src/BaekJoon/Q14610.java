package BaekJoon;

import java.util.Scanner;

public class Q14610 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int pattern[][] = new int[3][3];
		int L =sc.nextInt();
		for(int t=0; t<L; t++) {
			int N = sc.nextInt();
			int i = 0;
			if(N<4) {
				N = N-1;
				pattern[i][N] = 1;
			}
			else if(N<7) {
				i = 1;
				N = N-4;
				pattern[i][N] = 1;
			}
			else {
				i=2;
				N = N-7;
				pattern[i][N] = 1;
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("["+pattern[i][j]+"]");
			}
			System.out.println();
		}
	}
}
