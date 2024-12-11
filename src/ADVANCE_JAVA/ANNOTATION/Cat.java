package ADVANCE_JAVA.ANNOTATION;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

@VeryImportant
public class Cat {
    @VeryImportantMethod(times = 3)
    void annotated(){
        System.out.println("I am annotated!");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        if(cat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("Class is very important!");
        }

        for (Method method: cat.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(VeryImportantMethod.class)){
                System.out.println("Very Important Method Found! Invoking:__");
                try {
                    VeryImportantMethod veryImportantMethod = method.getAnnotation(VeryImportantMethod.class);
                    for(int i=0; i < veryImportantMethod.times();  i++) {
                        method.invoke(cat);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println(Arrays.stream(cat.getClass().getDeclaredFields()));//! Similarly
    }
}
