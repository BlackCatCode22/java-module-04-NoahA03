package zooApp;

public class Tiger extends Animal {
    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSpecies() {
        return "Tiger";
    }
}
