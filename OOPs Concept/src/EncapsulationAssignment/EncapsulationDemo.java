package EncapsulationAssignment;

public class EncapsulationDemo {
	private int ssn;
	private String empName;
	private int empAge;

	public int getSSN() {
		return  ssn;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpAge() {
		return empAge;
	}

	public void setEmpSSN(int NewValue) {
		ssn = NewValue;
	}
	public void setEmpName(String NewValue) {
		empName = NewValue;
	}

	public void setEmpAge(int NewValue) {
		empAge = NewValue;
	}
}