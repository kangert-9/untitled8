package lesson_6;

public class Main {
    public static void main(String[] args) {
        Cats cat1 = new Cats("Murka", 200, 2f);
        cat1.run(20);
        cat1.swim(5);
        cat1.jump(2f);
        Docs dog1 = new Docs("Bobik", 400, 10, 0.5f);
        dog1.run(500);
        dog1.swim(5);
        dog1.jump(0.3f);
        Docs dog2 = new Docs("Vasya", 600, 10, 0.5f);
        dog2.run(500);
        dog2.swim(10);
        dog2.jump(0.5f);
    }
}
