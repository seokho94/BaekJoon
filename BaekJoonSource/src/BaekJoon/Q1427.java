package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q1427 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int remainder = N;
		String L = Integer.toString(N);
		int Sort [] = new int [L.length()];
		for(int i=0; i<L.length(); i++) {
			Sort[i] = remainder/(int)Math.pow(10, L.length()-(i+1));
			remainder = remainder%(int)Math.pow(10, L.length()-(i+1));
		}
		Arrays.sort(Sort);
		for(int i=L.length()-1; i>=0; i--) {
			System.out.print(Sort[i]);
		}
	}
}
