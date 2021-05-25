package Constructors;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> listOfObjects = new ArrayList<Object>();




        Constructor object1 = new Constructor();
        Constructor object2 = new Constructor("Vasiliy");
        Constructor object3 = new Constructor(24);
        Constructor object4 = new Constructor("Petr");

        Constructor object5 = new Constructor("Stepan", 24);

        new Constructor();
        new Constructor("Kolya");
        new Constructor(44);


//        System.out.println(object2.name);
//        System.out.println(object3.age);
//        System.out.println(object5.name +", "+ object5.age);

        listOfObjects.add(new Constructor());
        listOfObjects.add(new Constructor());

       // System.out.println(listOfObjects);
        //System.out.println(listOfObjects.size());

        Constructor.objectToString(new Constructor(), new Constructor());
        System.out.println('\n');
        Constructor.objectToString(object2,object4);
    }
}
