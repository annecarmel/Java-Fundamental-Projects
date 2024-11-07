import java.util.ArrayList;
import java.util.Arrays;

class Playlist {
  public static void main(String[] args){
  String[] favoriteSongs = {"Queen - Bohemian Rhapsody", "xxx - xxxx", "yyy - yyyy", "uuu - uuuu", "hhh - hhhh", "iii - iiii", "ddd - dddd", "jjj - jjjj", "ppp - pppp", "sss - ssss"};

  System.out.println(favoriteSongs[0]+ "," + favoriteSongs[1] + "," + favoriteSongs[2]);

  ArrayList<String> favoriteSongsList = new ArrayList<>();

  ArrayList<String> desertIslandPlaylist = new ArrayList<>();

  desertIslandPlaylist.add("Anne");
  desertIslandPlaylist.add("Carmel");
  desertIslandPlaylist.add("hello");
  desertIslandPlaylist.add("yes love");
  desertIslandPlaylist.add("bue bue");
  desertIslandPlaylist.add("extra song 1");
    desertIslandPlaylist.add("extra song 2");

  System.out.println(desertIslandPlaylist);

  favoriteSongsList.addAll(Arrays.asList(desertIslandPlaylist.toArray(new String[0])));

  System.out.println("Number of songs in the playlist: " + desertIslandPlaylist.size());

  System.out.println("Number of songs before removal: " + desertIslandPlaylist.size());

    while (desertIslandPlaylist.size() > 5) {
      desertIslandPlaylist.remove(desertIslandPlaylist.size() - 1); 
    }
    System.out.println("Number of songs after removal: " + desertIslandPlaylist.size());
    System.out.println(desertIslandPlaylist);

     System.out.println("Current playlist: " + desertIslandPlaylist);

     String songA = "Anne";
    String songB = "bue bue";

    int indexA = desertIslandPlaylist.indexOf(songA);
    int indexB = desertIslandPlaylist.indexOf(songB);

    System.out.println("Index of " + songA + ": " + indexA);
    System.out.println("Index of " + songB + ": " + indexB);

    String tempA = songA;

    desertIslandPlaylist.set(indexA, songB);

    System.out.println("Playlist after replacing Song A with Song B: " + desertIslandPlaylist);

    desertIslandPlaylist.set(indexB, tempA);

    System.out.println("Playlist after swapping: " + desertIslandPlaylist);


  }
}
