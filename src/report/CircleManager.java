

package report;

import java.util.Scanner;


public class CircleManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle1 c[] = new Circle1[3];
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle1(x, y, radius);
		}
		int max = 0; 
		int k = 0;
		for (int i = 0; i < c.length; i++) {
			if(max<c[i].getRadius()) {
				max = c[i].getRadius();
				k = i;
			}
		}
		System.out.print("가장 면적이 큰 원은");
		c[k].show();
		sc.close();
	} 

}
