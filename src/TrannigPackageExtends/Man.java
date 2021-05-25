package TrannigPackageExtends;

public class Man extends Human {
    private double sizeOfDick;

    public void setSizeOfDick(double size) {
        this.sizeOfDick = size;
    }

    public double getSizeOfDick() {
        return sizeOfDick;
    }

    public void printSizeOfDick() {
        System.out.println("Size of dick is: " + getSizeOfDick() + " [sm]");
    }

}