// ������Ű��а� 201733022 ������

package report;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>> ");

			try {
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.println(n + "x" + m + "=" + n * m);
				break;
			} catch (InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				sc.nextLine();
			}

		}
		sc.close();
	}
}