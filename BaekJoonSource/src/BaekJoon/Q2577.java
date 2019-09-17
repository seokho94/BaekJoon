package BaekJoon;

import java.util.Scanner;

public class Q2577 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String str = Integer.toString(A*B*C);
		char Num[] = str.toCharArray();
		int count[] = new int[10];
		for(int i=0; i<Num.length; i++) {
			count[Num[i]-48]++;
		}
		for(int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}
	}
}
