
public class DiplomaWithHonors extends Diploma {
	
	public DiplomaWithHonors(String name, String course) {
		super(name, course);
	}
	
	public String toString() {
		return super.toString() + "\n*** with honors ***";
	}
}
