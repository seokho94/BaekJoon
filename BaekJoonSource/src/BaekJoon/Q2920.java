package BaekJoon;

import java.util.Scanner;

public class Q2920 {
	static String ascending(char number[],int count) {
		if(count==number.length-1) return "ascending";
		if(number[count]<number[count+1]) {
			count++;
			return ascending(number,count);
		}
		else return "mixed";
	}
	static String descending(char number[],int count) {
		if(count==number.length-1) return "descending";
		if(number[count]>number[count+1]) {
			count++;
			return descending(number,count);
		}
		else return "mixed";
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean check = true;
		int count = 1;
		str = str.replaceAll(" ", "");
		char number[] = str.toCharArray();
		if(number[0]<number[1]) {
			System.out.println(ascending(number,count));
		}
		else {
			System.out.println(descending(number,count));
		}
	}
}
