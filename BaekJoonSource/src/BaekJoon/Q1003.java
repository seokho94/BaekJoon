package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1003 { //0.25(s) == 250(ms)
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static int[] count = new int[2];
	public static void main(String args[]) throws IOException {
		long stTime = System.currentTimeMillis();
		{
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			fibonacci(num);
		}
		bw.flush();
		}
		long edTime = System.currentTimeMillis();
		System.out.println("time : "+(edTime-stTime));
	}
	public static void fibonacci(int num) throws IOException {
		count = new int[2];
		call(num);
		bw.write(count[0]+" "+count[1]+"\n");
	}
	public static void call(int number) {
		if(number==1) {count[1]++; return;}
		else if(number==0) {count[0]++; return;}
		else {
			call(number-2);
			call(number-1);
		}
	}
}
