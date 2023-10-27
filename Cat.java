public class Cat  extends Animal {

    private String color = "grey";

    public Cat(String name, String color) {
        this(name);
        this.color = color;
    }

    public Cat(String name) {
        super(name, 4, Type.MAMMAL);
        System.out.println(getName() + ": MEEEOOWWWW");
    }

    public String getColor(){
        return color;
    }

    public void meow(){
        System.out.println(getName() + " the " + color + " kitty is meowing.");
    }

}
