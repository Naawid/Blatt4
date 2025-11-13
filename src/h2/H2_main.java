package h2;

public class H2_main {
	public static void main(String[] args) {
		boolean x, y, a, b, c;
		int input = 0;
		x = true;
		y = false;
		a = false;
		b = true;
		c = false;

		if (input == 10 || input == 11) {
			x = true;
		} else {
			x = false;
		}
		if (input == 11 || input == 1) {
			y = true;
		} else {
			y = false;
		}

		if (x && y) {
			a = true;
		} else {
			a = false;
		}

		if (x || x != y) {
			b = true;
		} else {
			b = false;
		}

		if (x == true && y == false || x == false && y == false) {
			c = true;
		} else {
			c = false;
		}
		System.out.println("a= " + a + " b= " + b + " c= " + c + " x = " + x + " y= " + y);
	}
}
