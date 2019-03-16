package report;

import java.util.Scanner;

public class 실습문제3_14 {

	public static void main(String[] args) {

		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("과목 이름>> ");
			String name = sc.next();

			if (name.equals("그만")) {
				System.out.println("안녕히계세요 여러분 전 이만 갈게요");
				break;
			}

			for (int i = 0; i < course.length; i++) {
				if (name.equals(course[i])) {
					System.out.println(course[i] + "의 점수는 : " + score[i]);
					break; //배열값을 넘는것을 방지하기 위해 작성 , 그리고 무의미하게 증가하는 값을 방지
				}
				else if (i == course.length - 1)  // if조건절에서 없는 값을 구별
					System.out.println("없는데? 다시 작성 해줘요");
			

			}

		}
		sc.close();

	}

}
