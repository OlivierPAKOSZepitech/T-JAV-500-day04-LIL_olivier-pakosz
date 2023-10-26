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
    public Animal(String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;
        System.out.println("My name is " + name + " and I am a " + getTypeString(type) + "!");
    
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

public static String getAnimalCountMessage(int count, String animalType) {
        String pluralS = (count == 1) ? "" : "s";
        return "There " + (count == 1 ? "is" : "are") + " currently " + count + " " + animalType + pluralS + " in our world.";
    }

    public static void main(String[] args) {
        // Example usage
        new Animal("lion", 4, Type.MAMMAL);
        numberOfMammals++;

        new Animal("salmon", 0, Type.FISH);
        numberOfFish++;

        new Animal("eagle", 2, Type.BIRD);
        numberOfBirds++;
        
        System.out.println(getAnimalCountMessage(getNumberOfAnimals(), "animal"));
        System.out.println(getAnimalCountMessage(getNumberOfMammals(), "mammal"));
        System.out.println(getAnimalCountMessage(getNumberOfFish(), "fish"));
        System.out.println(getAnimalCountMessage(getNumberOfBirds(), "bird"));
    }
}