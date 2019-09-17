package BaekJoon;

import java.util.Scanner;

public class Q11729 {
	static StringBuilder sb = new StringBuilder();
	static int OddpatternA(int A) {
		int patternA[] = {1,2,3};
		return patternA[A-1];
	}
	static int OddpatternB(int A) {
		int patternB[] = {2,3,1};
		return patternB[A-1];
	}
	static int EvenpatternA(int A) {
		int patternA[] = {1,3,2};
		return patternA[A-1];
	}
	static int EvenpatternB(int A) {
		int patternB[] = {3,2,1};
		return patternB[A-1];
	}
	static int HanoiResult(int N) {
		int result = (int)Math.pow(2, N)-1;
		return result;
	}
	static StringBuilder path(int R, StringBuilder s, int i) {
		if(s.length()==R) {
			i=0;
			return s;
		}
		else {
			sb = new StringBuilder(new String(Integer.toString(i)));
			sb = sb.append(s);
			s = s.append(sb);
			i++;
			path(R, s, i);
		}
		return s;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int R = HanoiResult(N);
		int i = 1;
		System.out.println(R);
		sb = path(R,sb,i);
		int count[] = new int[N];
		for(i=0; i<sb.length(); i++) {
			int num = Integer.valueOf(sb.substring(i, i+1));
			count[num-1]++;
			if(count[num-1]>3) {
				count[num-1]=1;
			}
			if(N%2==0) {
				if(num%2==0) {
					int A = EvenpatternA(count[num-1]);
					int B = EvenpatternB(count[num-1]);
					System.out.println(A+" "+B);
				}
				else if(num%2!=0) {
					int A = OddpatternA(count[num-1]);
					int B = OddpatternB(count[num-1]);
					System.out.println(A+" "+B);
				}
			}
			else if(N%2!=0) {
				if(num%2==0) {
					int A = OddpatternA(count[num-1]);
					int B = OddpatternB(count[num-1]);
					System.out.println(A+" "+B);
				}
				else if(num%2!=0) {
					int A = EvenpatternA(count[num-1]);
					int B = EvenpatternB(count[num-1]);
					System.out.println(A+" "+B);
				}
			}
		}
	}
}
