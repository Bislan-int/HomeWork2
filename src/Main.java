public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat", true, "Barsik", "black");
        cat.mammal();
        cat.sound();
        Human human = new Human("Bislan", 23);
        human.mammal();
        human.hobby("Codding");
    }
}
