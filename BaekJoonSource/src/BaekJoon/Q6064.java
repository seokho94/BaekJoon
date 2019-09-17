package BaekJoon;

import java.util.Scanner;

public class Q6064 { //백준 6064번 문제
	static int Year(int A, int B, int C, int D) {
		int X=0, Y=0, i=0;;
		int result = -1;
		while(X!=A || Y!=B) {
			if(X<A) {
				X++;
			}
			else {
				X=1;
			}
			if(Y<B) {
				Y++;
			}
			else {
				Y=1;
			}
			i++;
			if(X==C && Y==D) {
				return result=i;
			}
		}
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		for(int i=0; i<T; i++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(Year(M,N,x,y));
		}
	}
}
