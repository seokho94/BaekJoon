package BaekJoon;

import java.util.Scanner;

public class Q11729ver2 {
	static StringBuilder sb = new StringBuilder();
	static int Oddpattern(int A) {
		int pattern[] = {12,23,31};
		return pattern[A];
	}
	static int Evenpattern(int A) {
		int pattern[] = {13,32,21};
		return pattern[A];
	}
	static int HanoiResult(int N) {
		int result = (int)Math.pow(2, N)-1;
		return result;
	}
	static StringBuilder path(int N, StringBuilder s, int i, int cnt) {
		if(cnt==N) {
			return s;
		}
		else {
			sb = new StringBuilder(new String(Integer.toString(i)));
			sb = sb.append(s);
			s = s.append(sb);
			s = new StringBuilder(s.toString().replace("121", "C"));
			i++;
			cnt++;
			return path(N, s, i, cnt);
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int R = HanoiResult(N);
		int i = 1;
		int cnt = 0;
		System.out.println(R);
		sb = path(N,sb,i, cnt);
		int count[] = new int[N];
		while(cnt<sb.length()) {
			if(N%2!=0) {
				if(sb.charAt(cnt)=='C') {
					int Output = Evenpattern(count[0]%3);
					System.out.println(Output/10+" "+Output%10);
					count[0]++;
					Output = Oddpattern(count[1]%3);
					System.out.println(Output/10+" "+Output%10);
					count[1]++;
					Output = Evenpattern(count[0]%3);
					System.out.println(Output/10+" "+Output%10);
					count[0]++;
				}
				else {
					int Num = Integer.valueOf(sb.toString().substring(cnt, cnt+1));
					if(Num%2==0) {
						int Output = Oddpattern(count[Num-1]%3);
						System.out.println(Output/10+" "+Output%10);
						count[Num-1]++;
					}
					else {
						int Output = Evenpattern(count[Num-1]%3);
						System.out.println(Output/10+" "+Output%10);
						count[Num-1]++;
					}
				}
			}
			else if(N%2==0) {
				if(sb.charAt(cnt)=='C') {
					int Output = Oddpattern(count[0]%3);
					System.out.println(Output/10+" "+Output%10);
					count[0]++;
					Output = Evenpattern(count[1]%3);
					System.out.println(Output/10+" "+Output%10);
					count[1]++;
					Output = Oddpattern(count[0]%3);
					System.out.println(Output/10+" "+Output%10);
					count[0]++;
				}
				else {
					if(sb.charAt(cnt+1)=='C') {
						int Num = Integer.valueOf(sb.toString().substring(cnt, cnt+1));
						if(Num%2==0) {
							int Output = Evenpattern(count[Num-1]%3);
							System.out.println(Output/10+" "+Output%10);
							count[Num-1]++;
						}
						else {
							int Output = Oddpattern(count[Num-1]%3);
							System.out.println(Output/10+" "+Output%10);
							count[Num-1]++;
						}
					}
					else {
						int Num = Integer.valueOf(sb.toString().substring(cnt, cnt+2));
						cnt++;
						if(Num%2==0) {
							int Output = Evenpattern(count[Num-1]%3);
							System.out.println(Output/10+" "+Output%10);
							count[Num-1]++;
						}
						else {
							int Output = Oddpattern(count[Num-1]%3);
							System.out.println(Output/10+" "+Output%10);
							count[Num-1]++;
						}
					}
				}
			}
			cnt++;
		}
	}
}
