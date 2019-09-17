package BaekJoon;

import java.util.Scanner;

public class Q1436Ver2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int series = 666;
		for(int i=1; i<N; i++) {
			series = series+1000;
		}
		System.out.println(series);
	}
}
