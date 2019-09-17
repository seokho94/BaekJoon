package BaekJoon;

import java.util.Scanner;

public class Q1065 {
	static boolean Num(int N) {
		boolean result = true;
		int A = N/100;
		int B = (N%100)/10;
		int C = (N%100)%10;
		if((A-B)!=(B-C)) {
			result = false;
		}
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N<100) {
			System.out.println(N);
		}
		else {
			int count = 99;
			for(int i=100; i<=N; i++) {
				if(Num(i)==true) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
