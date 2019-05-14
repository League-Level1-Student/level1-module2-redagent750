import javax.swing.JOptionPane;

public class Person {
	 String person;
	 String superPower;

	String getPerson() {
		return this.person;
	}
	
	String getSuperPower() {
		return this.superPower;

	}
	
	public void setPerson(String person) {
		this.person = person;
		System.out.println("This person's name is " + person);
	}
	
	public void setSuperPower(String superPower) {
		this.superPower = superPower;
		System.out.println("Their super power is " + superPower);
	}
}
 