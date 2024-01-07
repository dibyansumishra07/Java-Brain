package BackToBasics.arrayExample;

import java.util.*;

class User{
	int id;
	String firstName;
	String lastName;
	public User(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
public class ArrayExample {

	static void maintainUniqueness(List<User> list){
		Map<Integer, User> map=new HashMap<>();
		list.forEach(item->map.put(item.getId(), item));
		map.forEach((k,v) -> {
			System.out.println(k+ " " + " firstName: " +v.getFirstName() + " lastName: " +v.getLastName());
		});
//		map.entrySet().forEach(item->System.out.println(item.getKey()+item.getValue()));
//		return list;
	}

	public static void main(String[] args) {
		User user1=new User(1,"Daddy", "M");
		User user2=new User(1,"Mummy", "M");
		User user3=new User(2,"Behen", "P");
		User user4=new User(3,"Shruti","G");
		List<User> dupList=Arrays.asList(user1,user2,user3,user4);
		maintainUniqueness(dupList);
	}

}
