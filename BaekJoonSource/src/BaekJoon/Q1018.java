package BaekJoon;

import java.util.Scanner;

public class Q1018 {
	static int Error(char A[]) {
		int result=0;
		for(int i=0; i<A.length-1; i++) {
		}
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int correction = 0;
		for(int i=0; i<M; i++) {
			char pattern[] = sc.nextLine().toCharArray();
			correction+=Error(pattern);
			System.out.println(pattern[0]+pattern[1]);
		}
		System.out.println(correction);
	}
}
