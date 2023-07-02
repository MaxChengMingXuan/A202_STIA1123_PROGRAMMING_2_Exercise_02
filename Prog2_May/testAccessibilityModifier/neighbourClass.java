package testAccessibilityModifier;

public class neighbourClass {
	Source test=new Source();
	
	void Print() {
	System.out.println(test.toString());
	
	System.out.println(test.aDefault);
	System.out.println(test.aProtect);
	System.out.println(test.aPublic);
	//System.out.println(test.aPrivate); is not visible
	}
}
