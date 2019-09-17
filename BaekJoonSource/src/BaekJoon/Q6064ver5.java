package BaekJoon;

import java.util.Scanner;

public class Q6064ver5 {
	static int inca(int M , int N , int x, int y) {
		int result = 0;
		boolean check = false;
		for(int i=0,j=0; i*j<M*N;) {
			if(i<M) i++;
			else i=1;
			if(j<N) j++;
			else j=1;
			result++;
			if(i==x&&j==y) {
				check =true;
				break;
			}
		}
		if(check==false) result=-1;
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
			System.out.println(inca(M,N,x,y));
		}
	}
}