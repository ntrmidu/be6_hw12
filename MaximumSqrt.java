package be6_hw12;

public class MaximumSqrt {

	public static void main(String[] args) {
		int a = 6000;
		int b = 7000;

		int c = Solution(a, b);
		System.out.println("The maximum number of repeated square root between " + a + " and " + b + " is: " + c);

	}

	public static int Solution(int a, int b) {

		int globalCount = 0;
		int low = a;
		int high = b;

		while (low <= high) {
			int localCount = 0;
			double sqrt = Math.sqrt(low);
			while (sqrt % 1 == 0) {
				sqrt = Math.sqrt(sqrt);
				localCount++;
			}
			globalCount = Math.max(localCount, globalCount);
			low++;
		}
		return globalCount;

	}

}
