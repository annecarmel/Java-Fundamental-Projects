//create an empty Mayan class that inherits from Language.
class Mayan extends Language {

   Mayan(String languageName, int speakers) {
    //regionsSpoken: "Central America", wordOrder: "verb-object-subject"
    super(languageName, speakers, "Central America", "verb-object-subject");
  }

  @Override
  public void getInfo() {
  //Override the getInfo() method for Mayan so that if we called getInfo() on a Mayan language like Ki’che’
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);
    System.out.println("Fun fact: " + this.name + " is an ergative language.");

  }

}
