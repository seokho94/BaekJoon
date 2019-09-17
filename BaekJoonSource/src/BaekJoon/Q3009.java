package BaekJoon;

import java.util.Scanner;

public class Q3009 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rectangle[][] = new int[3][2];
		for(int i=0; i<3; i++) {
			int j = 0;
			rectangle[i][j] = sc.nextInt();
			j++;
			rectangle[i][j] = sc.nextInt();
		}
		int x=0, y=0;
		for(int i=0; i<3; i++) {
			int count = 0;
			for(int j=0; j<3; j++) {
				if(rectangle[i][0]==rectangle[j][0]) {
					count++;
				}
			}
			if(count == 1) {
				x = rectangle[i][0];
			}
			count=0;
			for(int t=0; t<3; t++) {
				if(rectangle[i][1]==rectangle[t][1]) {
					count++;
				}
			}
			if(count==1) {
				y = rectangle[i][1];
			}
		}
		System.out.print(x + " " + y);
	}
}
