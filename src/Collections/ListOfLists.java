package Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ListOfLists {

    public static void main(String[] args) {
        List<Person> listOfPerson = new ArrayList<>();
        listOfPerson.add(new Person(1, "Dibyansu"));
        listOfPerson.add(new Person(1, "Shruti"));
        listOfPerson.add(new Person(3, "Gitu"));
        listOfPerson.add(new Person(4, "Bisu"));
        List<List<Person>> listOfListOfPerson = new ArrayList<>();
        List<Integer> idList=new ArrayList<>();
        for(Person P: listOfPerson){
            idList.add(P.id);
        }
        for (int i = 0; i < idList.size(); i++) {
            List<Person> personWithThread=new ArrayList<>();
            for (int j = 0; j < listOfPerson.size(); j++) {
                if(listOfPerson.get(j).id==idList.get(i))
                {
                    personWithThread.add(listOfPerson.get(i));
                }
            }
            listOfListOfPerson.add(personWithThread);
        }
        System.out.println(listOfListOfPerson);


    }
}
