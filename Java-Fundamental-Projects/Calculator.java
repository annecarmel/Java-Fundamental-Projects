//Created a class named the same as file name
public class Calculator{

  //Created a empty constructor name Calculator 
  public Calculator(){

  }
    //Adding method for calculation such as add(), subtract(), multiply() and divide() with 2 parameters int a & b
    public int add(int a, int b)
{
      //Returning the Result in Sum of both variables
    return a + b;
    }

    //Repeating same for other calculations
    public int subtract(int a, int b)
{
      return a - b;
    }
    public int multiply(int a, int b)
{
      return a * b;
    }
    public int divide(int a, int b)
{
      return a / b;
    }
    public int modulo(int a, int b)
{
      return a % b;
    }
  
  //Opening a main class
  public static void main(String[] args) {
    //create a Calculator object called myCalculator.
  Calculator myCalculator = new Calculator();
   //value of calling the subtract() method on myCalculator. Pass in 45 and 11 as parameters.
  System.out.println(myCalculator.add(5,7));
  System.out.println(myCalculator.subtract(45,11));
  }

}