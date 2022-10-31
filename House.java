import java.util.ArrayList;
/* Defines the house class that extends the building class*/
public class House extends Building{

  private ArrayList<String> residents; 
  private boolean hasDiningRoom;

  /**
   * Constructs the house object
   * @param name the name of the house
   * @param address the address of the house
   * @param nFloors the number of floors the house has
   * @param hasDiningRoom T/F : Whether or not the house has a dining room
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom){
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Accesses the value which denotes whether or not the house has a dining room
   * @return T/F: If the house has a dining room
   */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;}

  /**
   * Accesses the value which denotes how many residents the house contains
   * @return amount of residents in the hosue
   */
  public boolean nResidents(){
    return this.residents.isEmpty();}

  /**
   * Adds a person to the list of residents upon moving in
   * @param name the name of the resident moving in
   */
  public void moveIn(String name){
    this.residents.add(name);}

  /**
   * Removes the name of person moving out from the list of residents
   * @param name the name of the person moving out
   * @return the name of the person moving out
   */
  public String moveOut(String name) {// return the name of the person who moved out
    this.residents.remove(name);
    return name;}

  /**
   * Checks whether or not a person is a resident given their name
   * @param person the name of a person
   * @return T/F: Whether or not they are a resident of the building
   */
  public boolean isResident(String person){
    return this.residents.contains(person);}

  /**
   * Runs the main program
   * @param args an empty string array
   */
  public static void main(String[] args) {
    House myHome = new House("Decora House", "66 Paradise Road", 2, false);
    System.out.println(myHome);
    System.out.println(myHome.hasDiningRoom());
    myHome.moveIn("Sam");
    myHome.moveIn("Cat");
    System.out.println(myHome.isResident("Cat"));
    System.out.println(myHome.isResident("Liam"));}

}