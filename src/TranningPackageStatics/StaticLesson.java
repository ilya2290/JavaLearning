package TranningPackageStatics;

 public class StaticLesson {

    public static int value1 = 0;
    public static double value2 = 0.0;
    public static String value3 = "empty";
    public static char a = 'a';


    public static int staticPowerFunction(int a, int b){

        //System.out.println(a^b);
        return a^b;
    }

    public static void staticMultFunction(int a, int b){
        System.out.println(a = a*b);

    }

    public void additionFunc(int a, int b){
        System.out.println(a+b);
    }


    static int zp= 100;

    public int getzp(){
        return this.zp/28;
     }



    int anotherValue1 = 0; // без объекта незя

     public static void main(String[] args) {
         System.out.println(value1);
         System.out.println();

         //System.out.println(getzp());
     }
 }

