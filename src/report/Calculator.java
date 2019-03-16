

package report;

import java.util.Scanner;

public class Calculator {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		String x = sc.next();
		double b = sc.nextDouble();

		switch (x) {

		case "+":
			System.out.println(a + "+" + b + "=" + (a + b));
			break;

		case "-":
			System.out.println(a + "-" + b + "=" + (a - b));
			break;

		case "*":
			System.out.println(a + "*" + b + "=" + (a * b));
			break;

		case "/":
			if (b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				System.out.println(a + "/" + b + "=" + (a / b));
			}
			break;

		}
		sc.close();
	}

}
