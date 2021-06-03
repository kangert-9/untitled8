package lesson_6;

public class Docs extends Pets {
    int max_dist_run = 500;
    int max_dist_swim = 10;
    float max_dist_jump = 0.5f;

    public Docs(String name, int max_dist_run, int max_dist_swim, float max_dist_jump) {
        super(name);
        this.max_dist_run = max_dist_run;
        this.max_dist_swim = max_dist_swim;
        this.max_dist_jump = max_dist_jump;
    }
    @Override
    public void run(int length) {
        if (length >= 0) {
            if (length <= max_dist_run) {
                System.out.println(this.name + " пробежал " + length + " метров");
            } else {
                System.out.println("собаки столько не бегают!");
            }
        } else {
            System.out.println("что-то не понятное число");
        }
    }
    @Override
    public void swim(int length) {
        if (length >= 0) {
            if (length <= max_dist_swim) {
                System.out.println(this.name + " проплыл " + length + " метров");
            } else {
                System.out.println("собаки столько не плавают!");
            }
        } else {
            System.out.println("что-то не понятное число");
        }
    }
    @Override
    public void jump(float length) {
        if (length >= 0) {
            if (length <= max_dist_jump) {
                System.out.println(this.name + " прыгнул на " + length + " метров");
            } else {
                System.out.println("Собаки так не прыгают!");
            }
        } else {
            System.out.println("что-то не понятное число");
        }
    }
}

