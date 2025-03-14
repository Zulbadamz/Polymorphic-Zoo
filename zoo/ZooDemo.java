package zoo;

import java.util.ArrayList;

public class ZooDemo {
    public static void main(String[] args) {
        // Create an ArrayList to store Animal objects
        ArrayList<Animal> zoo = new ArrayList<>();
        
        // Instantiate different animals
        zoo.add(new Lion("Simba"));
        zoo.add(new Elephant("Dumbo"));
        zoo.add(new Monkey("George"));

        // Loop through the collection and call both versions of makeSound
        for (Animal animal : zoo) {
            System.out.println("Animal: " + animal.getName());
            animal.makeSound();
            animal.makeSound(3);  // Make the sound 3 times
            System.out.println(); // Line break for clarity
        }
    }
}
