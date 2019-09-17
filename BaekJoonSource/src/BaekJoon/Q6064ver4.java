package BaekJoon;

import java.util.Scanner;

public class Q6064ver4 {
	static int calendar(int M, int N, int x, int y) {
		int result = -1;
		int count = 0;
		for(int i=0, j=0; i*j<M*N;) {
			if(i<M) i++;
			else i=1;
			if(j<N) j++;
			else j=1;
			count ++;
			if(i==x && j==y) {
				result = count;
				break;
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
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(calendar(M,N,x,y));
		}
	}
}
