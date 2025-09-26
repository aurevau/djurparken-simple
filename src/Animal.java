import java.util.Random;

public abstract class Animal {

    String name;
    int age;


    Animal(String name){
        this.name = name;
        this.age = assignAge();

    }

    public String getName(){
        return name;
    }


    public void checkAge(){
        if (age <= 2) {
            System.out.println(this.toString() + " is " + age + " years old and is still a baby");
        } else if (age < 5) {
            System.out.println(this.toString() + " is " + age + " years old and is still a little one");
        } else if (age > 5) {
            System.out.println(this.toString() + " is " + age + " years old and is all grown up");
        }

    }



    public int assignAge(){
        Random rng = new Random();
        int age = rng.nextInt(1, 25);
        return age;
    }

    public String toString(){
       return "[" + this.getClass().getName() + "] " + name;
    }


    public abstract void eat();
    public abstract void makeSound();

}
