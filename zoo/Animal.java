package zoo;

public abstract class Animal {
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method for sound
    public abstract void makeSound();

    // Overloaded method to repeat sound multiple times
    public void makeSound(int times) {
        if (times <= 0) {
            System.out.println(name + " makes no sound.");
            return;
        }
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

