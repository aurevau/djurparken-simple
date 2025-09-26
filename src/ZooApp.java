import java.util.ArrayList;
import java.util.Scanner;


public class ZooApp {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Animal> animals = new ArrayList<>();
    public ZooApp(){
        initList();
        run();







    }



    public void initList(){
        animals.add(new Cat("Missen"));
        animals.add(new Cat("Gustav"));
        animals.add(new Cow ("Maggie"));
        animals.add(new Cow ("Fru Caloway"));
        animals.add(new Cow ("Grace"));
        animals.add(new Horse("Buck"));
        animals.add(new Horse("Bird"));


    }
    public void run(){
        for (Animal animal : animals){
            animal.makeSound();
            scanner.nextLine();
            animal.eat();
            scanner.nextLine();
            animal.checkAge();
            scanner.nextLine();



            if (animal instanceof Gallop g) {
                g.gallop();
            } else if (animal instanceof Climb c){
                c.climb();
            } else if (animal instanceof Trainable t){
                t.performTrick();
            } else {
                continue;
            }  scanner.nextLine();
        }

    }
}
