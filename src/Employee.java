
public class Employee extends User {



	private boolean isEmployee;
	
	public Employee(String username, String password, boolean isEmployee) {
		super(username, password);
		// TODO Auto-generated constructor stub		
		this.isEmployee = isEmployee;
	}

	public boolean isEmployee() {
		return isEmployee;
	}

	public void setEmployee(boolean isEmployee) {
		this.isEmployee = isEmployee;
	}
	
}
