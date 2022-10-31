import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building{

  private Hashtable<String, Boolean> collection;

  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }

  public void addTitle(String title){
    this.collection.put(title, true);
  }
  
  public String removeTitle(String title){
    this.collection.remove(title);
    return title;

  }

  public void checkOut(String title){
    this.collection.replace(title, true, false);
  }

  public void return_book(String title){
    this.collection.replace(title, false, true);
  }

  public boolean containsTitle(String title){ // returns true if the title appears as a key in the Libary's collection, false otherwise
  return this.collection.containsKey(title);
  }

  public boolean isAvailable(String title){
    boolean value = this.collection.getOrDefault(title, false);
    
    if (value == true){
      System.out.println("\"" + title + "\" is Available!");
    } else {
      System.out.println("Sorry, \"" + title + "\" is not Available!");
    }
    return value;
  }

  public void printCollection(){

    int num_books = this.collection.keySet().size();

    System.out.println("Current Collection:");

    for (int i=0;i < num_books; i++){
      Object book = this.collection.keySet().toArray()[i];
      System.out.println(book + ", Availability: " + this.collection.get(book));
    }

  }


  
  public static void main(String[] args) {
    Library myLib = new Library("Neilson", "7 Neilson Drive", 4);
    myLib.addTitle("The Giver");
    myLib.addTitle("Diary of a Wimpy Kid");
    myLib.printCollection();
    myLib.checkOut("The Giver");
    myLib.isAvailable("The Giver");
  }
  

  }