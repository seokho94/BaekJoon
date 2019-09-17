package BaekJoon;

import java.util.Scanner;

public class Q2920Ver2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int scale[] = new int[8];
		boolean check = true;
		for(int i=0; i<8; i++) {
			scale[i]=sc.nextInt();
		}
		if(scale[0]<scale[1]) {
			for(int i=0; i<7; i++) {
				if(scale[i]>scale[i+1]) {
					check = false;
				}
			}
			if(check==true) System.out.println("ascending");
			else System.out.println("mixed");
		}
		else {
			for(int i=0; i<7; i++) {
				if(scale[i]<scale[i+1]) {
					check = false;
				}
			}
			if(check==true) System.out.println("descending");
			else System.out.println("mixed");
		}
	}
}
