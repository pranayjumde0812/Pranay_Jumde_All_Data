package Question_1;

public class Check {
    int age;

    public Check(int age, String mob) {
        this.age = age;
        this.mob = mob;
    }

    String mob;

    @Override
    public String toString() {
        return
                "age=" + age + ", mob=" + mob;
    }

}
