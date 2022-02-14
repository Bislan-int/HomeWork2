public class Human implements Mammalable{
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void mammal() {
        System.out.println("Human is mammal");
    }

    public String hobby(String myHobby) {
        return myHobby;
    }
}
