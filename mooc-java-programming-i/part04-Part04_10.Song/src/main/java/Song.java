public class Song {

  private String nm;
  private int x;

  public Song(String str, int i) {
    nm=str;
    x=i;
  }

  public String name(){
    return nm;
  };

  public int length() {
    return x;
  }

  public static void main(String[] args) {
    // This is just an empty main method, where you can test your
    // Song class. You can for instance try this:

    // Song garden = new Song("In The Garden", 10910);
    // System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");


    Song garden = new Song("In the Garden", 10910);

    System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");



  }




}
