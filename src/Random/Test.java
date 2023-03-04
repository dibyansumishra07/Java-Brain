package Random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class A {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public A(int x) {
        this.x = x;
    }
}

public class Test {
    public static void main(String ara[]) {
        Map<Integer, Integer> map=new HashMap<>();
        List<A> list = new ArrayList<>();
        List<Integer> ids=new ArrayList<>();
        list.add(new A(5));
        list.add(new A(5));
        list.add(new A(6));
        list.add(new A(7));
        list.add(new A(7));
        List<List<A>> listOfList = new ArrayList<>();
        for(A a: list){
            ids.add(a.getX());
        }
        for(int i=0;i<list.size();i++){
           if(ids.contains(list.get(i).getX()))
           {
               map.put(i,list.get(i).getX());
           }
           else {
               map.put(i,list.get(i).getX());
           }
        }


    }
}
