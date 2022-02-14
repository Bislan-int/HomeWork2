public class Cat extends Animal implements Mammalable {
    private String nickname;
    private String color;

    public Cat(String kindOfAnimal, boolean isLandAnimals, String nickname, String color) {
        super(kindOfAnimal, isLandAnimals);
        this.nickname = nickname;
        this.color = color;
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void mammal() {
        System.out.println("Cat is mammal");
    }
}
