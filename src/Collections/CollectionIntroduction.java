package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Persons {

}

public class CollectionIntroduction {

    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        lists.remove(String.valueOf(4));
        System.out.println(lists);
    }
}
