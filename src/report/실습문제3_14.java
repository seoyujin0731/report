package report;

import java.util.Scanner;

public class �ǽ�����3_14 {

	public static void main(String[] args) {

		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���� �̸�>> ");
			String name = sc.next();

			if (name.equals("�׸�")) {
				System.out.println("�ȳ����輼�� ������ �� �̸� ���Կ�");
				break;
			}

			for (int i = 0; i < course.length; i++) {
				if (name.equals(course[i])) {
					System.out.println(course[i] + "�� ������ : " + score[i]);
					break; //�迭���� �Ѵ°��� �����ϱ� ���� �ۼ� , �׸��� ���ǹ��ϰ� �����ϴ� ���� ����
				}
				else if (i == course.length - 1)  // if���������� ���� ���� ����
					System.out.println("���µ�? �ٽ� �ۼ� �����");
			

			}

		}
		sc.close();

	}

}
