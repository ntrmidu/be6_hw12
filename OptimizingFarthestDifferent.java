package be6_hw12;

import java.util.*;

public class OptimizingFarthestDifferent {

	public static void main(String[] args) {

		int[] A = { 4, 6, 2, 2, 6, 6, 4 };
		System.out.println(Solution(A));

	}

	public static int Solution(int[] A) {
		int N = A.length;
		int result = 0;
//		for (int i = 0; i < N; i++) {
//			for (int j = i; j < N; j++) {
//				if (A[i] != A[j]) {
//					result = Math.max(result, j-1);
//				}
//			}
//		}
//		return result;

		for (int i = 0; i < N; i++) {

			if (A[i] != A[0]) {
				result = Math.max(result, i);
			} else if (A[i] != A[N - 1]) {
				result = Math.max(result, N - i);
			}
		}
		return result;

	}
}