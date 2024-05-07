package be6_hw12;

import java.util.Arrays;

public class EarlistTime {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 1;
		int c = 2;
		int d = 4;
		int e = 5;
		int f = 6;
		Solution(a,b,c,d,e,f);
		

	}
	

	public static void Solution (int a, int b, int c, int d, int e, int f) {
		int [] input = {a,b,c,d,e,f};
		Arrays.sort(input);
		
		if (input[4] < 6) {
			if (input[0]*10 + input[1] < 24) {
				System.out.println(input[0] + input[1] + ":" + input[2] + input[3] + ":" + input[4] + input[5]);
			}
		}
		
	}

}
