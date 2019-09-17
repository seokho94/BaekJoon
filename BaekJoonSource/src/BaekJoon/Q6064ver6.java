package BaekJoon;

import java.util.Scanner;

public class Q6064ver6 {
	static int LCM(int M, int N) {
		int tmp=-1;
		int a = Math.min(M, N);
		int b = Math.max(M, N);
		while(true) {
			if(tmp==0) break;
			tmp = b%a;
			b = a; 
			a = tmp;
		}
		return b;
	}
	static int inka(int M, int N, int x, int y) {
		int count = x%M;
		boolean check = false;
		int max  = (M*N)/LCM(M,N);
		if(count==0) count = M;
		if(N==y) y=0;
		while(count<max+1) {
			if((count%N)==y) {
				check = true;
				break;
			}
			else count+=M;
		}
		if(check==false) count=-1;
		return count;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(inka(M,N,x,y));
		}
	}
}
