package BaekJoon;

import java.util.Scanner;

public class Q17388 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		char check[] = str.toCharArray();
		int count = 0, score=0;
		for(int i=0; i<check.length; i++) {
			
			if(check[i]=='X') {
				count=0;
			}
			else if(check[i]=='O') {
				score+=(i+1)+count;
				count++;
			}
		}
		System.out.println(score);
	}
}
