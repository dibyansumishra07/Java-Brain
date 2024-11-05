package ADVANCE_JAVA.GENERICS;

import java.io.Serializable;

//! If we are extending then class will be first and then interfaces
class NumberContainer<T extends Number & Serializable>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
public class BoundedTypeGeneric {
    public static void main(String[] args) {
//        NumberContainer<String> numberContainer = new NumberContainer<>(); Wrong string is not a number
        NumberContainer<Integer> numberContainer = new NumberContainer<>();
    }
}
