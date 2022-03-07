//import java.util.concurrent.Callable;Create a new class called Calculator with the following methods:
//        1. A static method called powerInt(int num1,int num2)
//        This method should return num1 to the power num2.
//        2. A static method called powerDouble(double num1,int num2).
//        This method should return num1 to the power num2.
//        3. Invoke both the methods and test the functionalities.
//        Hint: Use Math.pow(double,double) to calculate the power.
public class Calculator {


    public static int powerInt(int num1,int num2){
      int s = num1;
      for(int i=2;i<=num2;i++)
      s=s*num1;
      return s;
    }
    public static double powerDouble(double num1,int num2)
    {
        double k=Math.pow(num1,num2);
        return k;
    }
    public static void main(String[] args) {
       Calculator obj= new Calculator();
        System.out.println( Calculator.powerInt(5,3));
        System.out.println(Calculator.powerDouble(3.2,4));

    }
}
