public class CellItem {

    protected String name;
    protected int cost;

    /**
     * Constructor that initializes cost to 0 and name to a parameter
     * 
     * @param name String for attribute 'name'
     */
    public CellItem(String name) {
        this(name, 0);
    }

    /**
     * Constructor that initializes cost and name to parameters
     * 
     * @param name String for attribute 'name'
     * @param cost int for attribute 'cost'
     */
    public CellItem(String name, int cost) {        
        this.name = name; // Set attribute 'name' to String argument
        this.cost = cost; // Set attribute 'cost' to int argument'
    }

    /**
     * Method to return the CellItem cost
     * 
     * @return int representing the CellItem cost
     */
    public int getCost() { // return 'cost'
        return this.cost; 
    }

    /**
     * Method to return the CellItem name
     * 
     * @return String representing the CellItem name
     */
    public String getName() { // return 'name'        
        return this.name;
    }

    /**
     * Overriden toString() method
     * 
     * @return String with the CellItem name
     */
    @Override
    public String toString() { /* Declare method toString() */ 
        String name = "Name : " + this.name; 
        return name; // return String 'name'
    }

}
