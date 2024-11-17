/* In Language.java, create a Language class with a main() method and the following fields:

name: a protected string.
numSpeakers: a protected integer.
regionsSpoken: a protected string.
wordOrder: a protected string.*/
class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

/* Above the main() method, give Language a constructor that sets each field to the values passed in.*/
  Language(String langName, int speakers, String regions, String wdOrder) {
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = wdOrder;
  } 

  /*Create a public method for Language called getInfo().*/

    public void getInfo() {

    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);

    }
 
 /*In main(), instantiate a new Language of your choice.
 Then call getInfo() on the Language variable.*/
  public static void main(String[] args) {
  Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
  spanish.getInfo();

  //In main(), instantiate a new Mayan language of your choice, Then call getInfo() on the language variable.
   Mayan kiche = new Mayan("Ki'che'", 2330000);
   kiche.getInfo();

   // One Chinese (e.g., “Mandarin Chinese”)One non-Chinese (e.g., Burmese),Then call getInfo() on each language variable.
   
  SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
  mandarin.getInfo();
  SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
  burmese.getInfo();

  }

  


}
