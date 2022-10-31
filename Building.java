/** Defines a building class */
public class Building {

    private String name = "<Name Unknown>";
    private String address = "<Address Unknown>";
    private int nFloors = 1;

    /**
     * Constructs the building object
     * @param name The building name
     * @param address The building's address
     * @param nFloors The number of floors the building contains
     * @throws a runtime exception if user trys to construct building with fewer than 1 floor
     */

    public Building(String name, String address, int nFloors)  {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * Accesses the building's name attribute
     * @return the building name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Accesses the building's address attribute
     * @return the building's address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Accesses the building's number of floors
     * @return the number of floors the building has
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * Defines how the building objects get printed to the console
     * @return a message with the building's information
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    /**
     * Runs the main program
     * @param args an empty string array
     */

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}