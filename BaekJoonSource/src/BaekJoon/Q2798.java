package BaekJoon;

import java.util.Scanner;

public class Q2798 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int result = 0, max = 0, match=0;
		int Card[] = new int[N];
		for(int i=0; i<N; i++) {
			Card[i] = sc.nextInt();
		}
		int count = 0;
		for(int i=0; i<N-2; i++) {
			int sum =0;
			int j=i+1;
			for(int t=j+1; t<N; t++) {
				count++;
				System.out.println(count);
				sum = Card[i]+Card[j]+Card[t];
				if(t==N-1 && j!=N-1) {
					j++;
					t=j;
				}
				if(sum>match && sum<=M) {
					match = sum;
				}
			}
			if(match>max) {
				max = match;
				result = max;
			}
			if(max==M) {
				break;
			}
		}
		System.out.println(result);
	}
}
