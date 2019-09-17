package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9461 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		long padobhan[] = Rule();
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			bw.write(padobhan[N]+"\n");
		}
		bw.flush();
	}
	public static long[] Rule() {
		long arr[] = new long[101];
		arr[0]=0;
		arr[1]=1;
		arr[2]=1;
		arr[3]=1;
		arr[4]=2;
		for(int i=5; i<arr.length; i++) {
			arr[i]=arr[i-1]+arr[i-5];
		}
		return arr;
	}
}
