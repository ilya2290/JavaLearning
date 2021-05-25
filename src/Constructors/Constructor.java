package Constructors;

import java.util.ArrayList;
import java.util.List;

public class Constructor {

    List<Object> listOfObjects = new ArrayList<Object>();

    int age;
    String name;
    String nameOfMan;


    Constructor(String name) {

        this.name = name;
    }


    Constructor(int age) {
        this.age = age;
    }

    Constructor(String name, int age) {
        this.age = age;
        this.name = name;
    }

    Constructor() {

    }


    public static void objectToString(Object a, Object b) {

        System.out.println(a.getClass());
        System.out.println(a.toString() + " "+ "pizda");
        System.out.println(b.toString() + " "+ "huime");
    }

}


