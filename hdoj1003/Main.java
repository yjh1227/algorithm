package hdoj1003;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int mCase = 1;
		while (count != 0) {
			int length = sc.nextInt();
			long maxSum = -1001;
			long thisSum = 0;
			int start = 0;
			int end = 0;
			int tempIndex = 0;
			for (int i = 0; i < length; i++) {
				thisSum += sc.nextInt();
				if (thisSum > maxSum) {
					maxSum = thisSum;
					end = i;
					start = tempIndex;
				}
				if (thisSum < 0) {
					tempIndex = i + 1;
					thisSum = 0;
				}
			}
			System.out.println("Case " + mCase + ":");
			System.out.println(maxSum + " " + (start + 1) + " " + (end + 1));
			mCase++;
			count--;
			if (count != 0)
				System.out.println();
		}
	}
}
