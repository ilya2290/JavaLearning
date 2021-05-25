package TrannigPackageExtends;

public class Human {

     private String name;

    public void makeSound(){
        System.out.println("aaaaaa");
    }

    public void setHumanName (String name){
        this.name = name;
    }

    public String getHumanName(){ ///шо если стринг
        return name;
    }

    public void printHumanName() {
        System.out.println("The name is: "+getHumanName());
    }
}
