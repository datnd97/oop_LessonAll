package privateConstructor;

public class Animal {
    private String name;
    private Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
