package BaekJoon;

import java.util.Scanner;

public class Q1002 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			if(x1==x2 && y1==y2) {
				if(r1==r2) System.out.println("-1");
				else System.out.println("0");
			}
			else {
				int result = distance(x1,y1,r1,x2,y2,r2);
				System.out.println(result);
			}
		}
	}
	public static int distance(int x1, int y1, int r1, int x2, int y2, int r2) {
		int count =0;
		int distance_r = (r1+r2)*(r1+r2);
		int distance_point = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		int max = Math.max(r1, r2);
		int min = Math.min(r1, r2);
		if(distance_point<max*max) {
			if((max-min)*(max-min)==distance_point) count = 1;
			else if((max-min)*(max-min)<distance_point) count = 2;
			else if((max-min)*(max-min)>distance_point) count = 0;
		}
		else if(distance_r==distance_point) count = 1;
		else if(distance_r>distance_point) count = 2;
		else if(distance_r<distance_point) count = 0;
		return count;
	}
}
