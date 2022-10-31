import java.util.ArrayList;
/* This is a stub for the House class */
public class House extends Building{

  private ArrayList<String> residents; 
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom){
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom(){
    return this.hasDiningRoom;}

  public boolean nResidents(){
    return this.residents.isEmpty();}

  public void moveIn(String name){
    this.residents.add(name);}

  public String moveOut(String name) {// return the name of the person who moved out
    this.residents.remove(name);
    return name;}

  public boolean isResident(String person){
    return this.residents.contains(person);}

  public static void main(String[] args) {

    House myHome = new House("Decora House", "66 Paradise Road", 2, false);
    System.out.println(myHome);
    System.out.println(myHome.hasDiningRoom());
    myHome.moveIn("Sam");
    myHome.moveIn("Cat");
    System.out.println(myHome.isResident("Cat"));
    System.out.println(myHome.isResident("Liam"));}

}