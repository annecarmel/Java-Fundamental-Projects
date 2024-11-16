class BalanceString {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i <num.length(); i++){
            int digit = Character.getNumericValue(num.charAt(i));

            if(i % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit; 
            }    
    }   
    return evenSum == oddSum;
}

public static void main(String[] args) {

    BalanceString solution = new BalanceString();
    String num1 = "1230";
    String num2 = "12321";

    System.out.println("Is num1 balanced? " + solution.isBalanced(num1));
    System.out.println("Is num2 balanced? " + solution.isBalanced(num2));
}
}