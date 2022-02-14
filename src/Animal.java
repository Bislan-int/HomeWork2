public abstract class Animal {
    private String kindOfAnimal;
    private boolean isLandAnimals;

    public Animal(String kindOfAnimal, boolean isLandAnimals) {
        this.kindOfAnimal = kindOfAnimal;
        this.isLandAnimals = isLandAnimals;
    }

    public void sound() {}
}
