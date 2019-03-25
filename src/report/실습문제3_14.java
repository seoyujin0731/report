
//정보통신공학과 201733026 오지원

package report;

import java.util.Scanner;

public class 실습문제3_14 {

	public static void main(String[] args) {

		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("과목이름>> ");
			String name = sc.next();

			if (name == "그만")
				break;

			for (int i = 0; i < course.length; i++) {

				if (course[i].equals(name)) {
					int n = score[i];
					System.out.println(name + "의 점수는 " + n);
					break;
				} else if (i == course.length - 1) {
					System.out.println("없는 과목입니다.");
				}

			}

		}
		sc.close();

	}

}
