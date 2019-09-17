package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;

public class Q1181 {
	private static void mergeSort(String[] arr) {
		String[] tmp = new String[arr.length];
		mergeSort(arr,tmp,0,arr.length-1);
	}
	private static void mergeSort(String arr[], String tmp[], int start, int end) {
		if(start<end) {
			int mid = (start + end) / 2;
			mergeSort(arr,tmp,start,mid);
			mergeSort(arr,tmp,mid+1,end);
			merge(arr, tmp, start, mid, end);
		}
	}
	private static void merge(String arr[], String tmp[], int start, 
			int mid, int end) {
		for (int i = start; i<=end; i++) {
			tmp[i] = arr[i];
		}
			int part1 = start;
			int part2 = mid+1;
			int index = start;
			while(part1 <=mid && part2<=end) {
				if(tmp[part1].length()<tmp[part2].length()) {
					arr[index] = tmp[part1];
					part1++;
				}
				else if(tmp[part1].length()>tmp[part2].length()){
					arr[index] = tmp[part2];
					part2++;
				}
				else {
					int result = Dictionary_Check(tmp,part1,part2);
					if(result == part1) {
						arr[index] = tmp[part1];
						part1++;
					}
					else if(result == part2) {
						arr[index] = tmp[part2];
						part2++;
					}
				}
				index++;
			}
			for(int i=0; i<=mid-part1; i++) {
				arr[index + i] = tmp[part1 + i];
			}
		}
	private static int Dictionary_Check(String[] words,int part1, int part2) {
		int index = 0;
		int result = 0;
		while(index<words[part1].length()) {
			if(words[part1].charAt(index)<words[part2].charAt(index)) {
				result = part1;
				break;
			}
			else if(words[part1].charAt(index)>words[part2].charAt(index)) {
				result = part2;
				break;
			}
			index++;
		}
		return result;
	}
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashSet<String> hs = new HashSet<>();
		try{
			int N = Integer.parseInt(br.readLine());
			
			for(int i=0; i<N; i++) {
				hs.add(br.readLine());
			}
			String words[] = new String[hs.size()];
			int index=0;
			Iterator<String> it = hs.iterator();
			while(it.hasNext()) {
				words[index]=it.next();
				index++;
			}
			mergeSort(words);
			for(int i=0; i<words.length; i++) {
				if(words[i].equals("")==false) {
					bw.write(words[i]+"\n");
				}
			}
			bw.flush();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
