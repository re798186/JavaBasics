package patterns;

public class PatternsUsingLoops {
	public static void main(String[] args) {
		PatternsUsingLoops p = new PatternsUsingLoops();
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
	

	private void pattern2() {
		int n = 10;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (i == 0 && j != n - 1 || j == 0 || j == n - 1 && i != 0 && i != n - 1 || i == n - 1 && j != n - 1)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}

	}
}
