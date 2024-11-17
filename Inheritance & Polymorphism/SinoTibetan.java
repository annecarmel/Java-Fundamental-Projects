//The Sino-Tibetan family has the second highest number of native speakers of any language family.
class SinoTibetan extends Language {
//regionsSpoken: "Asia", wordOrder: "subject-object-verb"
SinoTibetan(String languageName, int speakers) {
  super(languageName, speakers, "Asia", "subject-object-verb");

  if (languageName.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
  //In the constructor, below where you called super(), change the wordOrder to "subject-verb-object" if this.name contains "Chinese".
    SinoTibetan(String languageName, int speakers) {
    super(languageName, speakers, "Asia", "subject-object-verb");
    if (languageName.contains("Chinese")) {
      this.wordOrder = "subject-verb-object";
    }
  }

}

}
