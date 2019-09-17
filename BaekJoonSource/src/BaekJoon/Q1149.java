package BaekJoon;

import java.util.Scanner;

public class Q1149 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		int R = 0;
		int G = 1;
		int B = 2;
		int min = 3;
		long sum = 0;
		int Price[] = new int[T];
		for(int i=0; i<T; i++) {
			String RGB[] = sc.nextLine().split(" ");
			int Red = Integer.parseInt(RGB[R]);
			int Green = Integer.parseInt(RGB[G]);
			int Blue = Integer.parseInt(RGB[B]);
			if(i==0) {
				min = Min(Red,Green,Blue);
				if(min==Red) Price[i] = R;
				else if(min==Green) Price[i] = G;
				else Price[i] = B;
				System.out.println("min : "+min);
			}
			else {
				if(Price[i-1]==R) {
					min =  Math.min(Green, Blue);
					if(min==Red) Price[i] = R;
					else if(min==Green) Price[i] = G;
					else Price[i] = B;
				}
				else if(Price[i-1]==G) {
					min = Math.min(Red, Blue);
					if(min==Red) Price[i] = R;
					else if(min==Green) Price[i] = G;
					else Price[i] = B;
				}
				else {
					min = Math.min(Red, Green);
					if(min==Red) Price[i] = R;
					else if(min==Green) Price[i] = G;
					else Price[i] = B;
				}
				System.out.println("min : "+min);
			}
			sum += min;
			System.out.println("sum : "+sum);
		}
		System.out.println(sum);
	}
	public static int Min(int A, int B, int C) {
		int min;
		int min_a = Math.min(A, B);
		int min_b = Math.min(B, C);
		if(min_a<min_b) min = min_a;
		else if(min_a>min_b) min = min_b;
		else min = min_a;
		return min;
	}
}
