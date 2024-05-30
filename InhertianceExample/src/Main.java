public class Main {
    public static void main(String[] args) {
    Animal animal = new Animal("Puff","small",45);
    doAnimalStuff(animal,"slow");
    Dog dog = new Dog();
    doAnimalStuff(dog,"fast");

    Dog yorkie = new Dog("Yorkie",15);
    doAnimalStuff(yorkie,"fast");
    Dog retriver = new Dog("labrador Retriever",65,"floppy","Swimmer");
    doAnimalStuff(retriver,"slow");
        Dog wolf = new Dog("wolf",40);
        doAnimalStuff(wolf,"slow");
        Fish fish = new Fish("goldie",0.35,2,4);
        doAnimalStuff(fish,"fast" );


    }


    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_____________________");
    }
}

