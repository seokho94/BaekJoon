package BaekJoon;

import java.util.*;

public class Q1157 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toUpperCase();
		char result = '?';
		if(str.length()==1) {
			System.out.println(str);
		}
		else {
		char alpha[] = str.toCharArray();
		int count[] = new int[26];
		for(int i=0; i<alpha.length; i++) {
			count[alpha[i]-65]++;
		}
		int max=0;
		for(int i=0; i<count.length; i++) {
			if(count[i]==max) {
				result = '?';
			}
			else if(count[i]>max) {
				max = count[i];
				result = (char)(i+65);
			}
		}
		System.out.println(result);
		}
	}
}