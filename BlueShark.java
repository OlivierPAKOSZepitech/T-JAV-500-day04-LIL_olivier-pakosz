public class BlueShark extends Shark {

    public BlueShark(String name) {
        super(name);
    }

    @Override
    public Boolean canEat(Animal animal) {
        return animal.getType().equals("fish") && super.canEat(animal);
    }

}
