package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10989 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
		int N = Integer.parseInt(br.readLine());
		int num[] = new int[10001];
		int max=0;
		for(int i=0; i<N; i++) {
			int t = Integer.parseInt(br.readLine());
			if(t>max) max=t;
			num[t]++;
		}
		for(int i=0; i<max+1; i++) {
			for(int j=0; j<num[i]; j++) {
				wr.write(String.valueOf(i));
				wr.write(System.lineSeparator());
			}
		}
		wr.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
