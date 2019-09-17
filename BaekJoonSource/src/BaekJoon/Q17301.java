package BaekJoon;

import java.util.Scanner;

public class Q17301 {
	static int check (StringBuilder s, int count) {
		if(s.indexOf("N")<s.indexOf("C")) {
			count++;
		}
		return count%1000000007;
	}
	static int mix(StringBuilder Word[], int i, int N, int count) {
		StringBuilder s = new StringBuilder();
		
		count = check(s, count);
		mix(Word,i,N,count);
		return count;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder Word[] = new StringBuilder[N];
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			Word[i] = new StringBuilder(sc.next());
		}
		int count = 0;
		int i = 0;
		while(i!=N) {
			count = mix(Word, i, N, count);
		}
		System.out.println(count);
	}
}
