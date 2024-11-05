package CORE_JAVA.IMMUTABILITY;

import java.util.List;

public class PlainClass {
    public static void main(String[] args) {
        List<String> hobbies = List.of("Coding");
        ImmutableClass ic = new ImmutableClass(1, "Dibyansu", hobbies);
        ImmutableClassWithEnum icEnum = new ImmutableClassWithEnum(MyEnum.VALUE1);
        System.out.println(ic.getHobbies().add("vdf"));
//        ic.getHobbies().add("Driving"); //Will throw unsupported operation exception at runtime
        System.out.println(ic.getHobbies());
    }
}
