package PolimorphismPractic;

public class Car {

    public static int sits = 4;
    public static int wheels = 4;

    public  void getWheels(){
        System.out.println(wheels);
    }

    public  void getWheels2(){
        System.out.println(wheels +2);
    }

    public static int getWheels3(int sits, int wheels){
        System.out.println(sits+ wheels);
        return sits + wheels;

    }

    public static void main(String[] args) {
       getWheels3(sits,wheels);

    }
}
