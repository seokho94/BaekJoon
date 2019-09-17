package BaekJoon;

import java.util.Scanner;

	public class Q6064ver2 { 
	static long Year(int A,int B, int C, int D) {
		int i =1;
		long End;
		long result = -1;
		if(C==A || D==B) {
			if(A<B) {
				while(true) {
					End = B*i;
					i++;
					if(End%A==0) {
						break;
					}
				}
				int X = D;
				while(X<=End) {
					if(X%A==0) {
						return result = X;
					}
					else {
						X = X+B;
					}
				}
			}
			else if(A>B) {
				while(true) {
					End = A*i;
					i++;
					if(End%B==0) {
						break;
					}
				}
				int X = C;
				while(X<=End) {
					if(X%B==0) {
						return result = X;
					}
					else {
						X = X+A;
					}
				}
			}
			else {
				if(C==D) {
					return result = C;
				}
			}
			return result;
		}
		if(A<B) {
			while(true) {
				End = B*i;
				i++;
				if(End%A==0) {
					break;
				}
			}
			int X = D;
			while(X<=End) {
				if(X%A==C) {
					return result = X;
				}
				else {
					X = X+B;
				}
			}
		}
		else if(A>B) {
			while(true) {
				End = A*i;
				i++;
				if(End%B==0) {
					break;
				}
			}
			int X = C;
			while(X<=End) {
				if(X%B==D) {
					return result = X;
				}
				else {
					X = X+A;
				}
			}
		}
		else {
			if(C==D) {
				return result = C;
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
