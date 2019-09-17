package BaekJoon;

import java.util.Scanner;

public class Q1011ver2 {
	static int move(int distance) {
		int result = 0;
		int i=0, count=1;
		while(i<distance) {
			result++;
			for(int t=0; t<count; t++) {
				i++;
				if(i==distance) break;
			}
				if(result%2==0) {
					count++;
				}
		}
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int distance = (N-M);
			System.out.println(move(distance));
		}
	}
}
