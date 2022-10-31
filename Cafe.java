/* This is a stub for the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces = 100; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets = 100; // The number of sugar packets remaining in inventory
    private int nCreams = 100; // The number of "splashes" of cream remaining in inventory
    private int nCups = 100; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (this.nCoffeeOunces < size){
        restock(100, 0, 0, 0);}
        if (this.nSugarPackets < nSugarPackets){
            restock(0, 100, 0, 0);}
        if (this.nCreams < nCreams){
            restock(0, 0, 100, 0);}
        if (this.nCups == 0){
            restock(0,0,0,100);}

        this.nCoffeeOunces -= size; 
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups; 
    }


    public static void main(String[] args) {
       Cafe myCafe = new Cafe("Compass Cafe", "7 Neilson Drive", 1);
        myCafe.sellCoffee(12, 2, 3);
        myCafe.sellCoffee(12, 2, 3);
    }
    
}
