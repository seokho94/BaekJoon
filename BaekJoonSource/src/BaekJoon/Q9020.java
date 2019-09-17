package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q9020 {
	public static void main(String args[]) {
		int Number[] = new int[10001];
		Arrays.fill(Number, 1);
		for(int i=0; i<=10000; i++) {
			if(i==0 || i==1) Number[i]=0;
			if(Number[i]==1) {
				int count=2;
				int remove = i*count;
				while(remove<=10000) {
					Number[remove]=0;
					count++;
					remove = i*count;
				}
			}
		}
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int Num = sc.nextInt();
			String Output = GoldBach(Num,Number);
			System.out.println(Output);
		}
	}
	public static String GoldBach(int Num,int[] Number) {
		int gap = 10000;
		int Number_Max = 0;
		int Number_Min = 0;
		for(int i=0; i<Num; i++) {
			if(Number[i]==1) {
				for(int j=0; j<=Num-i; j++) {
					if(i+j==Num && Number[j]==1) {
						int max = Math.max(i, j);
						int min = Math.min(i, j);
						if(gap>max-min) {
							gap=max-min;
							Number_Max = max;
							Number_Min = min;
							break;
						}
					}
				}
			}
		}
		String result = String.valueOf(Number_Min)+" "+String.valueOf(Number_Max);
		return result;
	}
}
