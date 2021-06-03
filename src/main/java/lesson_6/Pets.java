package lesson_6;


abstract class Pets {
    protected String name;

    public Pets(String name) {
        this.name=name;
    }


    abstract void run(int length);
    abstract void swim(int length);
    abstract void jump(float length);
}
