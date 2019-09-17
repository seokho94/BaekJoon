package BaekJoon;

import java.util.Scanner;

public class Q2908 {
	    public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
			String str1 = sc.next();
			String str2 = sc.next();
			StringBuffer sb1 = new StringBuffer(str1);
			str1 = sb1.reverse().toString();
			StringBuffer sb2 = new StringBuffer(str2);
			str2 = sb2.reverse().toString();
			if(Integer.parseInt(str1)>Integer.parseInt(str2)) {
				System.out.println(str1);
			}
			else {
				System.out.println(str2);
			}
	}
}
