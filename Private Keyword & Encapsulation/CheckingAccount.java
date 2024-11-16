public class CheckingAccount{
  public String name;
  private int balance;
  private String id;
  
  public CheckingAccount(String inputName, int inputBalance, String inputId){
    name = inputName;
    balance = inputBalance;
    id = inputId;
  }
  
  public int getBalance(){
    return this.balance;
  }

  public void setBalance(int newBalance){
    this.balance = newBalance;
  }
    
}