package BaekJoon;

import java.util.Scanner;

public class Q1316 {
	static boolean check(char word[], int j, int t) {
		boolean result = true;
		int count = 0;
		while(j+t<word.length) {
			if(word[j]==word[j+t]) {
				if(count==-1) {
					result = false;
					break;
				}
				else if(count==0 && t!=1) {
					result = false;
					break;
				}
				else count = 1;
			}
			else {
				if(count==1) {
					count = -1;
				}
			}
			t++;
		}
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		boolean result = false;
		for(int i=0; i<N; i++) {
			char word[] = sc.next().toCharArray();
			int t=1;
			if(word.length==1) result=true;
			else {
				for(int j=0; j<word.length-1; j++) {
					t=1;
					System.out.println(check(word,j,t));
					if(check(word,j,t)==true) result = true;
					else if (check(word,j,t)==false) {
						result = false;
						break;
					}
				}
			}
			if(result==true) count++;
		}
		System.out.println(count);
	}
}
