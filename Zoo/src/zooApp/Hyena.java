package zooApp;

public class Hyena extends Animal {
    public Hyena(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSpecies() {
        return "Hyena";
    }
}
