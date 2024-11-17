public class DNA {

  //DNA Sequencing
  public static void main(String[] args) {
             
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    
//Store them in different strings: dna1, dna2, and dna3.

    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

//Create a generic String variable called dna that can be set to any DNA sequence (dna1, dna2, dna3).

    String dna = dna2;

    //Find Length of DNA
    int length = dna.length();
    System.out.println("Length:" + length);

/*Remember that a protein has the following qualities:

It begins with a start codon ATG.
It ends with a stop codon TGA.
In between, the number of nucleotides is divisible by 3.
First, let’s start with the first condition. Does the DNA strand have the start codon ATG within it?

Find the index where ATG begins using indexOf(). */ 

    // Find start codon:
    int start = dna.indexOf("ATG");
    System.out.println("Start: " + start);

/* Next, does the DNA strand have the stop codon TGA?
Find the index where TGA begins. */

    // Find stop codon:
    int stop = dna.indexOf("TGA");
    System.out.println("Stop: " + stop);

/* Let’s start with an if statement that checks for a start codon and a stop codon using the && operator.
Remember that the indexOf() string method will return -1 if the substring doesn’t exist within a String.  */

    if (start != -1 && stop != -1) {
    System.out.println("Condition 1 and 2 are satisfied.");

/* Add a third condition that checks whether or not that the number of nucleotides in between the start codon and the stop condon is a multiple of 3.
Remember that the modulo operator % returns the remainder of a division. */

    if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
    System.out.println("Condition 1 and 2 and 3 are satisfied.");

/*Inside the if statement, create a String variable named protein.
And find this protein in the dna by using the substring() string method. Think about where you want the substring to begin and where you want the substring to end.
Remember that a codon is 3 nucleotides long.*/

    if (start != -1 &&
      stop != -1 &&
      (stop - start) % 3 == 0) {
      
       String protein = dna.substring(start, stop+3); 
       System.out.println("Protein: " + protein);
  
    } else {
    
    System.out.println("No protein.");
    
    }

  
}

  
}


}
  
}
