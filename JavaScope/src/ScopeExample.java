import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ScopeExample {
	// Accessible throughout the class
	String classVariable1;
	int classVariable2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void localMethod() {
		String localVariable1 = "Short Timer!";
		int localVariable2 = 123;
		boolean local = false;
	}
	
	void longMethod() {
		
		// Simple bracket example
		{
			int numberInBrackets = 0;
			numberInBrackets = 2; //in scope
		}
		numberInBrackets =1; // out of scope
		
		
		// loop example
		List list = new ArrayList();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
		}
		iterator // out of scope
		
	}

}
