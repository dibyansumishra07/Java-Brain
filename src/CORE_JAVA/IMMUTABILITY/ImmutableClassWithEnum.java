package CORE_JAVA.IMMUTABILITY;

public final class ImmutableClassWithEnum {
    private final MyEnum enumField;

    public ImmutableClassWithEnum(MyEnum enumField) {
        this.enumField = enumField;
    }

    public MyEnum getEnumField() {
        return enumField;
    }

    // No setter method or any other method that modifies enumField

    // Other fields and methods of the immutable class...
}

// Define the enum with immutable behavior
enum MyEnum {
    VALUE1,
    VALUE2,
    VALUE3;

    // No mutable state or methods that modify state
}
