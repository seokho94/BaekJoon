package BaekJoon;

import java.util.Scanner;

public class Q17362 {
	public static int[] Increase(int result[], int N) {
		if(result[1]<5) {
			if(result[0]==N) {
				return result;
			}
			result[0]++;
			result[1]++;
			Increase(result, N);
		}
		return result;
	}
	public static int[] Decrease(int result[],int N) {
		if(result[1]>1) {
			if(result[0]==N) {
				return result;
			}
			result[0]++;
			result[1]--;
			Decrease(result, N);
		}
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result[] = new int[2];
		result[0] = 1;
		result[1] = 1;
		while(result[0]!=N) {
			Increase(result, N);
			Decrease(result, N);
		}
		System.out.println(result[1]);
	}
}
