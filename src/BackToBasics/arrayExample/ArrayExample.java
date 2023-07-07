package arrayExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class User{
	int id;
	String firstName;
	public User(int id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	
	
}
public class ArrayExample {
	
	static List<User> maintainUniqueness(List<User> list){
		Map<Integer, String> map=new TreeMap<>();
		list.forEach(item->map.put(item.getId(), item.getFirstName()));
		map.entrySet().forEach(item->System.out.println(item.getKey()+item.getValue()));
		return list;
		
	}
	
	public static void main(String[] args) {
		User user1=new User(1,"Daddy");
		User user2=new User(1,"Mummy");
		User user3=new User(2,"Behen");
		User user4=new User(3,"Shruti");
		List<User> dupList=Arrays.asList(user1,user2,user3,user4);
		
		maintainUniqueness(dupList);
	}

}
