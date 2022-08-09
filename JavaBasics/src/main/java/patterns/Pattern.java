package patterns;

public class Pattern {

	public static void main(String[] args) {
		Pattern p = new  Pattern();
		p.pattern1();
		}

		private void pattern1() {
		System.out.println(" Pattern 1 ");
		int count = 11;
		for (int i = 0; i < count; i++) {
		for (int j = 0; j < count; j++) {
		if (i == 0 || i == (count - 1) || j == 0 || j == (count - 1)) {
		System.out.print("*");
		} else {
		System.out.print(" ");
		}
		}
		System.out.println();
		}

	}

}
