package exam3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double[] ar = new double[] { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		Scanner sc = new Scanner(System.in);
		int clazz1 = sc.nextInt() - 1;
		int clazz2 = sc.nextInt() - 1;
		sc.close();

		double sum = ar[clazz1] + ar[clazz2];

		System.out.printf("%.1f", sum);
	}

}
