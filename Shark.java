public class Shark extends Animal {
    public Shark(String name, int legs, Type type) {
        super(name, legs, type);
    }
    
    public static void main() {
        Animal shark = new Animal("Sharky", 0, Type.FISH);
    }
}
