package BaekJoon;

import java.util.Scanner;

public class Q1904 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		Mix(N);
	}
	public static int[] Fibonacci(int N){
		int result[] = new int[N+1];
		for(int i=0; i<result.length; i++) {
			if(i<3) {
				if(i==0) result[i]=0;
				else if(i==1) result[i]=1;
				else result[i]=2;
			}
			else {
				result[i] = (result[i-1]+result[i-2])%15746;
			}
		}
		return result;
	}
	public static void Mix(int N) {
		int arr[] = Fibonacci(N);
		if(N<2) {
			if(N==0) System.out.println("0");
			else System.out.println("1");
		}
		else {
			System.out.println(arr[N]);
		}
	}
}
