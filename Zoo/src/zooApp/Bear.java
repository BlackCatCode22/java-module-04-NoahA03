package zooApp;

public class Bear extends Animal {
    public Bear(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSpecies() {
        return "Bear";
    }
}
