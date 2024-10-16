package collectionFramrework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee{
	String eName;

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}
	
}
class Customer{
	String cName;

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}
	
}

public class ObjectMappingExample {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		e1.seteName("Shrutu");
		e2.seteName("Dibyansu");
		e3.seteName("Simran");
		
		List<Employee> listOfEmp=Arrays.asList(e1,e2,e3);
		
		for(Customer c: mapToCustomerList(listOfEmp))
		{
			System.out.println("Mapped and Name is: "+c.getcName());
		}
	}

	private static List<Customer> mapToCustomerList(List<Employee> listOfEmp) {
		List<Customer> customers=new ArrayList<>();
		
		for (Employee employee : listOfEmp) {
			
			Customer customer=new Customer();
			customer.setcName(employee.geteName());
			customers.add(customer);
		}
		
		
		
		
		return customers;
	}

}
