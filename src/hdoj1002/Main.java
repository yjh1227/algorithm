package hdoj1002;

import java.util.*;
import java.math.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			BigInteger A = sc.nextBigInteger();
			BigInteger B = sc.nextBigInteger();

			System.out.println("Case " + i + ":");
			System.out.println(A + " + " + B + " = " + A.add(B));
			if (i != n) {
				System.out.println();
			}
		}
	}
}