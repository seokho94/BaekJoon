package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11729_bufferdIO {
	    public static BufferedReader br;
	    public static BufferedWriter bw;

	    public static void main(String[] args) throws IOException {
	        br = new BufferedReader(new InputStreamReader(System.in));
	        bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        int disk = Integer.parseInt(br.readLine());
	        int count = (int) Math.pow(2, disk) - 1;

	        System.out.println(count);
	        hanoi(disk, 1, 3);

	        bw.flush();
	        br.close();
	        bw.close();
	    }

	    public static void hanoi(int disk, int from, int to) throws IOException {
	    	int middle = 6-from - to;
	        if (disk == 1) {
	        	bw.write(from + " " + to + "\n");
	        }
	        else {
	        	 hanoi(disk - 1, from, middle);
	             hanoi(1,from, to);
	             hanoi(disk - 1, middle, to);
	        }
	  }
}