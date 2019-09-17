package BaekJoon;

public class Q6679 {
	public static void main(String args[]) {
		for(int i=1000; i<10000; i++) {
			int d = decimal(i);
			int t = duodecimal(i);
			int h = hexadecimal(i);
			if(d==t && t==h) {
				System.out.println(i);
			}
		}
	}
	public static int decimal(int num) {
		int result = 0;
		while(num>0) {
			result += num%10;
			num/=10;
		}
		return result;
	}
	public static int duodecimal(int num) {
		int result = 0;
		while(num>0) {
			result += num%12;
			num/=12;
		}
		return result;
	}
	public static int hexadecimal(int num) {
		int result = 0;
		while(num>0) {
			result += num%16;
			num/=16;
		}
		return result;
	}
}
