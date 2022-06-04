
public class Customer {
	public String fullName;
	public int age ;
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.fullName = "Great Learning";
		customer.age = 25;
		
		System.out.println("FullName: " +customer.fullName);
		System.out.println("Age: "+ customer.age);
	}

}
