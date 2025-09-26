public class Cat extends Animal implements Climb, Trainable{


    Cat(String name) {
        super(name);

    }

    @Override
    public void eat() {
        System.out.println(this.toString()   + " is drinking milk ");
    }

    @Override
    public void makeSound() {
        System.out.println("MEOW");

    }

    @Override
    public void climb() {
        System.out.println(this.toString() + " is climbing a tree ");
    }

    @Override
    public void performTrick() {
        System.out.println(this.toString() + " is playing dead ");
    }
}
