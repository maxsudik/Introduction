package Assignments.VictorAssignments;

public class AnimalCage {

    //This is an instance variable of Animal type
    Animal animal1;

    //This is constructor
    public AnimalCage(Animal animal1) {
        this.animal1 = animal1;
    }


    //Here we call methods from Animal class
    public static void makeNoise(){
        Animal.makeSound1();
        Animal.makeSound2();
    }

    //Here we create a method to path argument to animal1 parameter
    public void createWildAnimal(){
        System.out.println("Wild animal " +animal1+ " is created");
    }

}