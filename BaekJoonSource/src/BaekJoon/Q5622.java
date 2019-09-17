package BaekJoon;

import java.util.Scanner;

public class Q5622 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char call[] = str.toCharArray();
		int sum = 0;
		for(int i=0; i<call.length; i++) {
			char spell = call[i];
			if(spell<58 && spell>47) {
				if(spell==80) {
					sum = sum + 11;
				}
				else {
				sum = sum + (int)(spell)-79;
				}
			}
			else {
				switch(spell) {
					case 'A' :
					case 'B' :
					case 'C' :
						sum = sum + 3;
						break;
					case 'D' :
					case 'E' :
					case 'F' :
						sum = sum + 4;
						break;
					case 'G' :
					case 'H' :
					case 'I' :
						sum = sum + 5;
						break;
					case 'J' :
					case 'K' :
					case 'L' :
						sum = sum + 6;
						break;
					case 'M' :
					case 'N' :
					case 'O' :
						sum = sum + 7;
						break;
					case 'P' :
					case 'Q' :
					case 'R' :
					case 'S' :
						sum = sum + 8;
						break;
					case 'T' :
					case 'U' :
					case 'V' :
						sum = sum + 9;
						break;
					case 'W' :
					case 'X' :
					case 'Y' :
					case 'Z' :
						sum = sum + 10;
						break;
				}
			}
		}
		System.out.println(sum);
	}
}
