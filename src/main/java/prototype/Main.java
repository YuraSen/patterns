package prototype;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(21, "Yura");
        System.out.println(human);

        Human human1 = (Human) human.copy();
        System.out.println(human1);

        HumanFactory factory = new HumanFactory();
        factory.setPrototype(new Human(50, "Petro"));
        Human copy1 = factory.makeCopy();
        System.out.println(copy1);

    }
}
