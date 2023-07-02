package testAccessibilityModifier;

public class Main {

	public static void main(String[] args) {
		Source test = new Source();
		System.out.println(test.toString());
		if (true) {
			System.out.println(test.aDefault);
			System.out.println(test.aProtect);
		}

		System.out.println(test.aPublic);
		// System.out.println(test.aPrivate); is not visible
	}

}
