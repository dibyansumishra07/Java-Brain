package ADVANCE_JAVA.GENERICS;
/*
 * Generic with single value
 * */
class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

/*
* Generic with two value
* */
class Pair<K,V>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

interface Container<T>{
    void add(T item);

    T get();
}

class GenericContainer<T> implements Container<T>{

    private T item;

    @Override
    public void add(T item) {
        item = item;
    }

    @Override
    public T get() {
        return item;
    }
}
public class GenericConcept {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(1);
        System.out.println(box.getValue());

        Pair<Integer, String> pair = new Pair<>(1, "Dibyansu");
        System.out.println(pair.getValue());

    }
}
