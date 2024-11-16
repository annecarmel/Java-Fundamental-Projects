//Starting the project by defining the class Droid.
public class Droid {
    //Adding batteryLevel & name as instance
  String name;
  int batteryLevel;

//Creating a constructor method for the Droid class, with 1 parameter String droidName.
  public Droid (String droidName){
   name = droidName;
   //setting batteryLevel to 100
   batteryLevel = 100;
  }

   public String toString(){
    return "Hello, I am the droid" + name;
  }
//Defining new method
  public void performTask(String task){
  System.out.println(name +" is performing task: "+ task);
  //setting batteryLevel to be 10 less than it was before.
  batteryLevel -=10;
  }

//Creating a energyReport() method that prints the instance’s batteryLevel.
  public void energyReport(){
    System.out.println(name + "'s battery level: " + batteryLevel);
   
  }

//Creating a method energyTransfer() that exchanges batteryLevel between instances.
  public void energyTransfer(Droid otherDroid, int amount) {
    if (batteryLevel >= amount) {
      batteryLevel -= amount;
      otherDroid.batteryLevel += amount;
      System.out.println("Transferred " + amount + " energy from " + name + " to " + otherDroid.name);
    } else {
      System.out.println(name + " does not have enough energy to transfer.");
    }
  }

public static void main (String[] args){
    //nside main(), creating a new instance of Droid named "Codey".
Droid Codey = new Droid("Anne");
Droid margot = new Droid ("Carmel");
Codey.performTask("dancing");
margot.performTask("levitating");

//Playing around with new instance and methods
  Codey.energyReport();
    margot.energyReport();

    Codey.energyTransfer(margot, 20);
    Codey.energyReport();
    margot.energyReport();
}

}

