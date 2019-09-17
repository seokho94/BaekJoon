package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q1929 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int Number[] = new int [N+1];
		Arrays.fill(Number, 1);
		for(int i=0; i<=N; i++) {
			if(i==0 || i==1) Number[i]=0;
			if(Number[i]==1) {
				int count=2;
				int remove = 0;
				while(remove<=N) {
					Number[remove]=0;
					remove = i*count;
					count++;
				}
			}
		}
		int check = 0;
		for(int t=M; t<Number.length; t++) {
			if(Number[t]==1) {
				check++;
				System.out.println(t+" "+check);
			}
		}
	}
}
