import java.util.ArrayList;
import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type.
   */
  public static void feed(List list) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Eagle");
    strings.add("Kiwi");
    strings.add("Penguin");
    strings.add("Swallow");
    System.out.println("Feeding birds");

    // TODO feed birds in the cycle
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type.
   * @param bird a new bird.
   */
  public static void acceptBird(List list, FlyingBird bird) {
    // TODO fix method declaration
    System.out.println("Accepting a bird to a section");
                                                            // TODO check flying bird wings
    bird.checkWings();
    // TODO add a bird to the list and print it
    List<FlyingBird> birds = new ArrayList<>();

    System.out.println(list);

  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds.
   * @param newBird bird to add.
   */
  public static void registerBird(List list, Bird newBird) {
    // TODO fix method declaration
    System.out.println("Adding a bird to the birds list");
    // TODO add a bird to list
    // TODO print birds in the cycle
  }
}