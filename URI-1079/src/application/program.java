package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double mid = (a * 2.0 + b * 3.0 + c * 5.0) / 10;
			System.out.printf("%.1f%n", mid);
		}
		
		sc.close();

	}

}
