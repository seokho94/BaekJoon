package BaekJoon;

import java.util.HashSet;
import java.util.Scanner;

public class Q17300 {
	static String check(int A[], int N) {
		String result = "YES";
		if(duplication(A,N).equals("NO")) {
			result = "NO";
			return result;
		}
		for(int i=0; i<N-1; i++) {
			if(sequence(A[i],A[i+1]).equals("NO")) {
				result = "NO";
				return result;
			}
		}
		return result;
	}
	static String duplication(int A[], int N) {
		String result = "YES";
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0; i<N; i++) {
			int temp = A[i];
			hs.add(temp);
		}
		if(hs.size()!=N) {
			result = "NO";
		}
		return result;
	}
	static String sequence(int A, int B) {
		String result = "YES";
		if((int)Math.abs(A-B)==1||(int)Math.abs(A-B)==2||
				(int)Math.abs(A-B)==3||(int)Math.abs(A-B)==4) {
			return result;
		}
		else result = "NO";
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int num[] = new int[L];
		for(int i=0; i<L; i++) {
			num[i]=sc.nextInt();
		}
		System.out.println(check(num,L));
	}
}
