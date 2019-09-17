package BaekJoon;

import java.util.Scanner;

public class Q1436 {
	static int Series(int N) {
		int First = 666;
		int Next = First + 1000*(N-1);
		return Next;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(Series(N));
	}
}
