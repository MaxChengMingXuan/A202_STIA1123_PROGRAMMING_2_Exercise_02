package testAccessibilityModifier;

public class Source {
	private int aPrivate=1;
	protected int aProtect=2;
	int aDefault=3;
	public int aPublic=4;
	
	public String toString() {
		return "\n"+aPrivate
			  +"\n"+aProtect
			  +"\n"+aDefault
			  +"\n"+aPublic;
		
	}
}


