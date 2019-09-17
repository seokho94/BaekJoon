package BaekJoon;

import java.util.Scanner;

public class Q11729ver3 {
	    public static void main(String[] args)  {
	    	Scanner sc = new Scanner(System.in);
	        int disk = sc.nextInt();
	        int count = (int) Math.pow(2, disk) - 1;
	        System.out.println(count);
	        hanoi(disk, 1, 3);
	    }
	    public static void hanoi(int disk, int from, int to){
	    	int middle = 6-from - to;
	        if (disk == 1) {
	        	System.out.println(from + " " + to);
	        }
	        else {
	        	 hanoi(disk - 1, from, middle);
	             hanoi(1,from, to);
	             hanoi(disk - 1, middle, to);
	        }
	    }
}
