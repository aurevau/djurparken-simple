public class Cow extends Animal implements Trainable{


    Cow(String name) {
        super(name);
    }

    @Override
    public void eat(){
        System.out.println(this.toString() + " is eating grass");

    }

    @Override
    public void makeSound(){
        System.out.println("MOOOO");
    }

    @Override
    public void performTrick() {
        System.out.println(this.toString() + " is singing");
    }
}
