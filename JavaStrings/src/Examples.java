
public class Examples {

	public static void main(String[] args) {
		//Remember to use the JavaDoc!  --- https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
		
		//Creating objects
		String option1 = "Creating a JavaString...";
		//or use the new keyword
		String option2 = new String("Use the new keyword");
		
		String str1 = "";
		String str2 = new String("");
		
		//Comparing strings
		if(str1 == str2) { doSomething();}  // doesn't compare strings but compares objects
		if(str1.equals(str2)) { doSomething();}
		if(str1.compareTo(str2) > 0) { switchSomething();}
		
		//Methods
		// charAt()
		char c10 = str1.charAt(10);
		
		// startsWith()
		String aStr = "Ab";
		if(aStr.startsWith("Abc")) { doSomething(); }
		
		// substring()
		String sentence = "My name is Simon and I really like to eat cookies.";
		String subStr = sentence.substring(0,10);
		
		// concat()
		String shorty1 = new String("I code therefore.. ");
		String longerStr = shorty1.concat("some more words...");
		
		// length()
		String longSentence = "Please go to the store and get me some eggs, bacon, and white bread.";
		int strLength = longSentence.length();
		
		// valueOf()
		boolean isFixed = true;
		float totCost = 12232.45f;
		String boolStr = String.valueOf(isFixed);
		String floatStr = String.valueOf(totCost);
	}

	private static void switchSomething() {
		// another do nothing method...
	}

	private static void doSomething() {
		// were just doing nothing here...
	}

}
