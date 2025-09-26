public class Horse extends Animal implements Gallop, Trainable {

    Horse(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println( this.toString() + " is eating hay ");
    }

    @Override
    public void makeSound() {
        System.out.println("iiihihihi");
    }

    @Override
    public void gallop() {
        System.out.println(this.toString() + " is galloping ");
    }

    @Override
    public void performTrick() {
        System.out.println(this.toString() + " is jumping over an obstacle");
    }
}
