

package report;

public class Circle1 {
	private double x, y;
	private int radius;

	public Circle1(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}

	public int getRadius() {
		return radius;
	}
}
