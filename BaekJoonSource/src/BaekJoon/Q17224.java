package BaekJoon;

import java.util.Scanner;

public class Q17224 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int K = sc.nextInt();
		int score = 0;
		int count = 0;
		int Easy[] = new int[N];
		int Hard[] = new int[N];
		for(int i=0; i<N; i++) {
			Easy[i] = sc.nextInt();
			Hard[i] = sc.nextInt();
		}
		for(int i=0; i<Hard.length; i++) {
			if(Hard[i]<=L) {
				Easy[i] = L+1;
				score = score+140;
				count++;
				if(count==K) break;
			}
		}
		for(int i=0; i<Easy.length; i++) {
			if(count==K) break;
			if(Easy[i]<=L) {
				score = score+100;
				count++;
				if(count==K) break;
			}
		}
		System.out.println(score);
	}
}
