package TranningPackageStatics;

public class Main {

    public static void main(String[] args) {





        StaticLesson object1 = new StaticLesson();
        StaticLesson.value1 =10;
        StaticLesson object2 = new StaticLesson();
      //  System.out.println(StaticLesson.value1);


        StaticLesson.staticPowerFunction(2,10);

        StaticLesson.staticMultFunction(4,3);


        object1.additionFunc(2,2);

    }
}
