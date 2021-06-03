package lesson_6;

public class Cats extends Pets {
    int max_dist_run=200;
    float max_dist_jump=2;
    private int length;

    public Cats(String name, int max_dist_run, float max_dist_jump) {
        super(name);
        this.max_dist_run=max_dist_run;
        this.max_dist_jump=max_dist_jump;
    }


    @Override
    void run(int length) { if (length >= 0) {
        if ((length <= max_dist_run)) {
            System.out.println(this.name + " пробежал " + length + " метров");
        } else {
            System.out.println("Коты столько не бегают!");
        }
    }
    else {
        System.out.println("что-то не понятное число");
    }

    }

    @Override
    void swim(int length) {
        if (length >= 0) {
            System.out.println("к сожалению, коты не умеют плавать даже на "+ length+ " метров");
        }
        else {
            System.out.println("что-то не понятное число");
        }

    }

    @Override
    void jump(float length) {
        if (length >= 0) {
            if(length<=max_dist_jump) {
                System.out.println(this.name+ " прыгнул на " + length + " метров");
            }
            else {
                System.out.println("Коты так не прыгают!");
            }
        }
        else {
            System.out.println("что-то не понятное число");
        }

    }
}
