
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee karthik = new Employee();
		karthik.name = "Karthikeyan";
		karthik.age = 35 ;
		karthik.employeeType = "V" ;
		karthik.gender = 'M' ;
		
		Boolean isEligible = karthik.isEligibleForLaptorp();
		
		System.out.println("Elibility of Karthik Laptop is" + isEligible);
		
	}

}
