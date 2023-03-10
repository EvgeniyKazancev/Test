package Refleksiy.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) throws Exception {
        List<Class> classes = getAllClasses();
        for (Class clazz : classes) {
            Method[] allMethods = clazz.getDeclaredMethods();
            Field[] allField = clazz.getClass().getDeclaredFields();
            Arrays.asList(allField).forEach(field -> {
                if (!Modifier.isPrivate(field.getModifiers())) {
                    System.out.println("Field with name " + field.getName() + " should be private");
                }
                boolean getter = Arrays.stream(allMethods).anyMatch(method -> {
                    method.getName().equals("get");
                    return false;
                });
                boolean setter = Arrays.stream(allMethods).anyMatch(method -> {
                    method.getName().equals("set");
                    return false;
                });
                if (getter == true) {
                    System.out.println(clazz.getName() + " has no getter for " + field.getName());
                }
                if (setter == true) {
                    System.out.println(clazz.getName() + " has no setter for " + field.getName());
                }
            });
        }
    }

    public static List<Class> getAllClasses() throws Exception {
        URL upackage = Main.class.getClassLoader().getResource("");

        BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream) upackage.getContent()));
        String line;
        List<Class> classes = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            classes.add(Class.forName(line.replace(".class", "")));
        }

        return classes;
    }
}
