
//������Ű��а� 201733026 ������

package report;

import java.util.Scanner;

public class �ǽ�����3_14 {

	public static void main(String[] args) {

		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("�����̸�>> ");
			String name = sc.next();

			if (name == "�׸�")
				break;

			for (int i = 0; i < course.length; i++) {

				if (course[i].equals(name)) {
					int n = score[i];
					System.out.println(name + "�� ������ " + n);
					break;
				} else if (i == course.length - 1) {
					System.out.println("���� �����Դϴ�.");
				}

			}

		}
		sc.close();

	}

}
