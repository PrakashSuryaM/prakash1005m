package TestNG;

public class Priority {
	int n = 100;

	private void first() {
		System.out.println("First");
	}


	private void middle() {
		System.out.println("Middle");
	}


	private void end() {
		System.out.println("End");
	}

	private void basic() {
		System.out.println("Basic");
	}

	private void auth() {
		System.out.println("Validation");

		if (n==100) {
			System.out.println("correct");
		} else {
			System.out.println("not correct");
		}
	}
}
