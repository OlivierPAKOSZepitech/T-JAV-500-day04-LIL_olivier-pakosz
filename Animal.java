public class Animal {
    protected enum Type { MAMMAL, FISH, BIRD }

    // Attributes
    private String name;
    private int legs;
    private Type type;

    // Private static fields to keep track of the number of animals of each type
    private static int numberOfAnimals = 0;
    private static int numberOfMammals = 0;
    private static int numberOfFish = 0;
    private static int numberOfBirds = 0;

    // Protected constructor
    protected Animal(String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;
        System.out.println("My name is " + name + " and I am a " + getTypeString(type) + "!");
        
        // Increment the counters for total animals and the specific type of animal
        numberOfAnimals++;
        switch (type) {
            case MAMMAL:
                numberOfMammals++;
                break;
            case FISH:
                numberOfFish++;
                break;
            case BIRD:
                numberOfBirds++;
                break;
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for legs
    public int getLegs() {
        return legs;
    }

    // Getter for type (returns a String)
    public String getType() {
        return getTypeString(type);
    }

    // Private static getter for the total number of animals
    public static int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    // Private static getter for the number of mammals
    public static int getNumberOfMammals() {
        return numberOfMammals;
    }

    // Private static getter for the number of fish
    public static int getNumberOfFish() {
        return numberOfFish;
    }

    // Private static getter for the number of birds
    public static int getNumberOfBirds() {
        return numberOfBirds;
    }

    // Convert the Type enum to a string
    private String getTypeString(Type type) {
        switch (type) {
            case MAMMAL:
                return "mammal";
            case FISH:
                return "fish";
            case BIRD:
                return "bird";
            default:
                return "unknown";
        }
    }

    // Example main method
    public static void main(String[] args) {
        Animal isidore = new Animal("Isidore", 4, Type.MAMMAL);
        Animal nemo = new Animal("Nemo", 0, Type.FISH);
        Animal tweety = new Animal("Tweety", 2, Type.BIRD);

        // Display the number of animals of each type
        System.out.println("There " + (numberOfMammals == 1 ? "is" : "are") + " currently " + numberOfMammals + " mammal(s) in our world.");
        System.out.println("There " + (numberOfFish == 1 ? "is" : "are") + " currently " + numberOfFish + " fish in our world.");
        System.out.println("There " + (numberOfBirds == 1 ? "is" : "are") + " currently " + numberOfBirds + " bird(s) in our world.");
        System.out.println("There " + (numberOfAnimals == 1 ? "is" : "are") + " currently " + numberOfAnimals + " animal(s) in our world.");
    }
}
