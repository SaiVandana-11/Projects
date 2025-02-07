public class Animal extends CellItem { /* Create the Animal class */ 
    public Animal (String name, int damage, int id) { /* Create the Animal(String, int1, int2) constructor */ 
        super(name); // Initializes CellItem 'name' with String argument
        cost = damage * id; // Intiializes CellItem 'cost' as int * int2
    }
}


    
        