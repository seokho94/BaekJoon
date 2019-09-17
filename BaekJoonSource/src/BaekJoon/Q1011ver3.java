package BaekJoon;

import java.util.Scanner;

public class Q1011ver3 {
	static int move(long distance) { //distance 이동해야할 거리
		int result = 0; //최소 이동 횟수
		long i=0, count=1;//i-거리변수, count-최소횟수 등장횟수
		while(i<distance) {
			result++;
			i+=count;
			if(i==distance) break;
			if(result%2==0) {
					count++;
				}
		}
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			long distance = (N-M);
			System.out.println(move(distance));
		}
	}
}
