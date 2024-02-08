package BackToBasics.arrayExample;

import java.util.function.Function;

public class Example {
    enum Shape{Circle, Rectangle, Sqare};
static Function<Integer,Integer> add(Integer x){
    return y-> y+x;
}
    public static void main(String[] args) {
//        Shape shape = null;
//        if(shape==Shape.Circle);
//        if(shape.equals(Shape.Circle));
    Function<Integer,Integer> addFour = add(4);
    Function<Integer,Integer> addSix = add(6);
    Integer result = addFour.apply(11);
        System.out.println(result);
    result = addSix.apply(4);
        System.out.println(result);
    }

}
