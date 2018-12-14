
public class Student {
	private String name;
	private int totalClass;
	private float currentGPA;
	
	int totalClients;
	String officerName;
	float monthlySales;
	
	// Valid variable names
	String startWithCharacter;
	String _startWithUnderscore; // Avoid
	String $startWithDollarsign; // Avoid 
	
	public void main(String[] args) {
		totalClients = 23;
		officerName = "Barney Fife";
		monthlySales = 1244.44f;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getTotalClass() {
		return totalClass;
	}


	public void setTotalClass(int totalClass) {
		this.totalClass = totalClass;
	}

	public float getCurrentGPA() {
		return currentGPA;
	}

	public void setCurrentGPA(float currentGPA) {
		this.currentGPA = currentGPA;
	}
	
	public String getAvailableCourse() {
		String courseName = findCollegeCourse(); //local variable
		return courseName;
	}

	public String getAvailableCourse(String semester, String major) {
		String courseName = findCollegeCourse(semester,major); //local variable
		return courseName;
	}
	
	private String findCollegeCourse(String semester, String major) {
		// TODO Auto-generated method stub
		return null;
	}

	private String findCollegeCourse() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
