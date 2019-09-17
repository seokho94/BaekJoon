package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q11650 {
	private static void mergeSort(int[][] arr) {
		int[][] tmp = new int[arr.length][2];
		mergeSort(arr,tmp,0,arr.length-1);
	}
	private static void mergeSort(int arr[][], int tmp[][], int start, int end) {
		if(start<end) {
			int mid = (start + end) / 2;
			mergeSort(arr,tmp,start,mid);
			mergeSort(arr,tmp,mid+1,end);
			merge(arr, tmp, start, mid, end);
		}
	}
	private static void merge(int arr[][], int tmp[][], int start, 
			int mid, int end) {
		for (int i = start; i<=end; i++) {
			tmp[i][0] = arr[i][0];
			tmp[i][1] = arr[i][1];
		}
			int part1 = start;
			int part2 = mid+1;
			int index = start;
			while(part1 <=mid && part2<=end) {
				if(tmp[part1][0]<tmp[part2][0]) {
					arr[index][0] = tmp[part1][0];
					arr[index][1] = tmp[part1][1];
					part1++;
				}
				else if(tmp[part1][0]>tmp[part2][0]) {
					arr[index][0] = tmp[part2][0];
					arr[index][1] = tmp[part2][1];
					part2++;
				}
				else {
					if(tmp[part1][1]<=tmp[part2][1]) {
						arr[index][0] = tmp[part1][0];
						arr[index][1] = tmp[part1][1];
						part1++;
					}
					else if(tmp[part1][1]>tmp[part2][1]) {
						arr[index][0] = tmp[part2][0];
						arr[index][1] = tmp[part2][1];
						part2++;
					}
				}
				index++;
				
			}
			for(int i=0; i<=mid-part1; i++) {
				arr[index + i][0] = tmp[part1 + i][0];
				arr[index + i][1] = tmp[part1 + i][1];
			}
		}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][2];
		for(int i=0; i<N; i++) {
			arr[i][0] = (int)(Math.random()*100000);
			arr[i][1] = (int)(Math.random()*100000);
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		System.out.println("Á¤·Ä ÈÄ");
		mergeSort(arr);
		for(int i=0; i<N; i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		sc.close();
	}
}
