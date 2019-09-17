package BaekJoon;

import java.util.Scanner;

public class Q15818 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = sc.nextInt();
		long result = 1L;
		for(int i=0; i<N; i++) {
			long num = sc.nextInt();
			result = ((result%M)*(num%M))%M;
		}
		System.out.println(result);
	}
}
