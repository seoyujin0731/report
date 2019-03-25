// 정보통신공학과 201733022 서유진

package report;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("곱하고자 하는 두 수 입력>> ");

			try {
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.println(n + "x" + m + "=" + n * m);
				break;
			} catch (InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				sc.nextLine();
			}

		}
		sc.close();
	}
}