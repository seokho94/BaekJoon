package BaekJoon;

import java.util.*;

public class Q2108 { 
	static int Avg(int A[]) {
		double sum=0;
		int result = 0;
		for(int i=0; i<A.length; i++) {
			sum = sum + (double)A[i];
		}
		result = (int)Math.round((double)sum/A.length);
		return result;
	}
	static int Medium(int A[]) {
		Arrays.sort(A);
		int result = A[(int)Math.floor(A.length/2)];
		return result;
	}
	static int Freq(int A[]) {
		if(A.length==1) return A[0];
		Arrays.sort(A);
		int count[] = new int[A.length];
		int index=0;
		for(int i=0; i<A.length; i++) {
			if(A[index]==A[i]) {
				count[index]++;
			}
			else if(A[index]!=A[i]) {
				index = i;
				count[index]++;
			}
		}
		int max = 0;
		boolean second = false;
		for(int i=0; i<count.length; i++) {
			if(max<count[i]) {
				max = count[i];
				index = i;
				second = false;
			}
			else if(max==count[i]) {
				if(A[i]>A[index] && second==false) {
					index = i;
					second = true;
				}
			}
		}
		return A[index];
	}
	static int Length(int A[]) {
		Arrays.sort(A);
		int max = A[0];
		int min = A[A.length-1];
		int result = Math.abs(max-min);
		if(A.length==1) {
			result = 0;
			return result;
		}
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num[] = new int[N];
		for(int i=0; i<N; i++) {
			num[i]=sc.nextInt();
		}
		System.out.println(Avg(num));
		System.out.println(Medium(num));
		System.out.println(Freq(num));
		System.out.println(Length(num));
	}
}
