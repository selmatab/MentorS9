

public class Student {

	
	private String name;
	private int indNum;
	private double gpa;

	public Student(String name, int indNum, double gpa) {
		this.name = name;
		this.indNum = indNum;
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", indNum=" + indNum + ", gpa=" + gpa
				+ "]";
	}

	
	public int compareTo(Student other) {
		if (this.gpa > other.gpa)
			return 1;
		else if (this.gpa < other.gpa)
			return -1;
		else {

			if (this.indNum > other.indNum)
				return 1;
			else if (this.indNum < other.indNum)
				return -1;
			else {
				if (this.name.compareTo(other.name) < 0)
					return 1;
				else if (this.name.compareTo(other.name) > 0)
					return -1;
				else
					return 0;
			}
		}
	}

	

}
