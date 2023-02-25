package inheritance;

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        doAnimalStuff(dog, "speed");

        Dog yorkie = new Dog("Yorkie", 15.0);
        doAnimalStuff(yorkie, "slow");

        Dog retriever = new Dog("Golden retriever", 65.0,
                "oval", "swimmy");
        doAnimalStuff(retriever, "speed");

        Fish goldie = new Fish("GoldFish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("-------");
    }
}
