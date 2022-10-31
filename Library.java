import java.util.Hashtable;

/* Defines the library class which is an extension of the building class */
public class Library extends Building{

  private Hashtable<String, Boolean> collection;

  /**
   * Constructs the library object
   * @param name the name of the library
   * @param address the address of the library
   * @param nFloors the amount of floors the library has
   */
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }

  /**
   * Adds a book title to the libraries collection
   * @param title the title of the book being added to the collection
   */
  public void addTitle(String title){
    this.collection.put(title, true);
  }
  
  /**
   * Removes a book from the collection
   * @param title the title of the book being removed
   * @return the title of the book being removed
   */
  public String removeTitle(String title){
    this.collection.remove(title);
    return title;

  }

  /**
   * Checks out a book and updates inventory to indicate books availability
   * @param title the title of the book being checked out
   */
  public void checkOut(String title){
    this.collection.replace(title, true, false);
  }

  /**
   * Returns a book to the library and updates inventroy to indicate books availability
   * @param title the title of the book being returned
   */
  public void return_book(String title){
    this.collection.replace(title, false, true);
  }

  /**
   * Checks whether a book is within the collection
   * @param title the name of a book
   * @return T/F: Whether or not it is part of the libraries collection
   */
  public boolean containsTitle(String title){ // returns true if the title appears as a key in the Libary's collection, false otherwise
  return this.collection.containsKey(title);
  }

  /**
   * Checks whether a given book is available
   * @param title the title of a book within the collection
   * @return T/F: Whether or not it is part of the libraries collection
   */
  public boolean isAvailable(String title){
    boolean value = this.collection.getOrDefault(title, false);
    
    if (value == true){
      System.out.println("\"" + title + "\" is Available!");
    } else {
      System.out.println("Sorry, \"" + title + "\" is not Available!");
    }
    return value;
  }

  /**
   * Prints the libraries collection by indicating book title and it's availability
   */

  public void printCollection(){

    int num_books = this.collection.keySet().size();

    System.out.println("Current Collection:");

    for (int i=0;i < num_books; i++){
      Object book = this.collection.keySet().toArray()[i];
      System.out.println(book + ", Availability: " + this.collection.get(book));
    }

  }


  /**
   * Runs the main program
   * @param args an empty string array
   */
  public static void main(String[] args) {
    Library myLib = new Library("Neilson", "7 Neilson Drive", 4);
    myLib.addTitle("The Giver");
    myLib.addTitle("Diary of a Wimpy Kid");
    myLib.printCollection();
    myLib.checkOut("The Giver");
    myLib.isAvailable("The Giver");
  }
  

  }