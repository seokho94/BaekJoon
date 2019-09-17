package BaekJoon;

import java.util.Scanner;

public class Q1193 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int denominator = 1, numerator = 1;
		int count_denominator = 1, count_numerator = 1;
		for(int i=1; i<N; i++) {
			if(denominator==1 || numerator==1) {
				if(denominator==1 && numerator!=1) {
					if(numerator%2==0) {
						numerator++;
					}
					else {
						denominator++;
						numerator--;
					}
				}
				else if(denominator!=1 && numerator==1) {
					if(denominator%2!=0) {
						denominator++;
					}
					else {
						denominator--;
						numerator++;
					}
				}
				else {
					denominator++;
				}
			}
			else if(denominator==numerator) {
				denominator++;
				numerator--;
			}
			else if(denominator>numerator && numerator!=1) {
				if((denominator-numerator)%2==0) {
					denominator++;
					numerator--;
				}
				else {
					denominator--;
					numerator++;
				}
			}
			else if(numerator>denominator && denominator!=1) {
				if((denominator-numerator)==1||(denominator-numerator)%2!=0) {
					denominator--;
					numerator++;
				}
				else {
					denominator++;
					numerator--;
				}
			}
		}
		System.out.println(numerator+"/"+denominator);
	}
}
