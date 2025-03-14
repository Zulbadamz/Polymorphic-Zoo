package zoo;

public class Monkey extends Animal {
    public Monkey(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Ooo Ooo Aah Aah!");
    }
}

