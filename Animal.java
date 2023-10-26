public class Animal {
    // Define the protected enum Type
    protected enum Type { MAMMAL, FISH, BIRD }

    // Attributes
    private String name;
    private int legs;
    private Type type;

    // Protected constructor
    protected Animal(String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;
        System.out.println("My name is " + name + " and I am a " + getTypeString(type) + "!");
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
        System.out.println(isidore.getName() + " has " + isidore.getLegs() + " legs and is a " + isidore.getType() + ".");
    }
}
