public class Cat extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name, 4, Type.MAMMAL);
        this.color = color != null ? color : "grey";
        System.out.println(getName() + ": MEEEOOWWWW");
    }

    public Cat(String name) {
        this(name, null);
    }

    public String getColor() {
        return color;
    }

    public void meow() {
        System.out.println(getName() + " the " + getColor() + " kitty is meowing.");
    }
}