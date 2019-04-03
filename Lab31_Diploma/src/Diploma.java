
public class Diploma {
	private String name, course;
	
	public Diploma(String name, String course) {
		this.name = name;
		this.course = course;
	}
	
	public String toString() {
		return "This certifies that\n" + name + "\nhas completed a course in " + course;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setDiploma(String diploma) {
		this.course = diploma;
	}
}
