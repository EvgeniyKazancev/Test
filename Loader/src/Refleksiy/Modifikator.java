package Refleksiy;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;

public class Modifikator {
    public static void main(String[] args) throws ClassNotFoundException {


    Class clazzArray = Class.forName("java.util.ArrayList");
        Class clazzAbstractList = Class.forName("java.util.AbstractList");
        Class clazzCollect = Class.forName("java.util.Collection");

        int arrayModifiers = clazzArray.getModifiers();
        int abstractListModifiers = clazzAbstractList.getModifiers();
        int collectModifiers = clazzCollect.getModifiers();

        System.out.println("ArrayList is Public ?: " + Modifier.isPublic(arrayModifiers));
        System.out.println("ArrayList is Protected ?: " + Modifier.isProtected(arrayModifiers));
        System.out.println("AbstractList is Static ?: " + Modifier.isStatic(abstractListModifiers));
        System.out.println("AbstractList is Abstract ?: " + Modifier.isAbstract(abstractListModifiers));

        System.out.println("Collection is Interface? :" + Modifier.isInterface(collectModifiers));


        Object map = new HashMap<>();
        Method[] methods = map.getClass().getDeclaredMethods();

        Arrays.stream(methods).forEach(System.out::println);

    }
}