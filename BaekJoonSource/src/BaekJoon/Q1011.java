package BaekJoon;

import java.util.Scanner;

public class Q1011 {
	static long Sum(long A) {
		long sum = 0;
		for(long i=A; i>=0; i--) {
			sum+=i;
		}
		return sum;
	}
	static int Number(long distance) {
		int result = 0;
		long path = distance;
		long next=1;
		long move = 0;
		while(true) {
			move+=next;
			path-=next;
			result++;
			System.out.println("남은거리 : "+path+" 총이동거리 : "+move+" 다음 이동거리 : "+next+" 이동 횟수 : "+result);
			if(path==0) break;
			if(Sum(next)<path) {
				if(Sum(next+1)<=path) next++;
			}
			else if(Sum(next)>path) next--;
			else next = next;
		}
		return result;
	}
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			long distance = N-M;
			System.out.println(Number(distance));
		}
	}
}
