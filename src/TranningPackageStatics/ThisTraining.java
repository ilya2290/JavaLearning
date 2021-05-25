package TranningPackageStatics;

public class ThisTraining {

    public static int salaryOfTrueMan = 2000;
    private  int salaryOfNormalMan = 200;

    public static void salaryComparator(){

        if (salaryOfTrueMan < 3000){
            System.out.println("This is not TRUE MAN");
        }
        else {
            System.out.println("True man");
        }
    }


    public void salaryOfTrueManComparator(int x){
        if (this.salaryOfNormalMan <x){
            System.out.println("LOX");
        }
    }

    public static void setSalaryOfTrueManComparatorTwo(int x){
        if(salaryOfTrueMan < x ){
            System.out.println("UEBOK");
        }
    }



    public static void main(String[] args) {
        ThisTraining obj = new ThisTraining();


       salaryComparator();
        obj.salaryOfTrueManComparator(3000);
        setSalaryOfTrueManComparatorTwo(5000);

    }
}

