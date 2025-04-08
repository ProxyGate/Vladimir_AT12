package homework.day2.basetask.animals_and_sous;

public class Mouse {
    private int age = 0;
    private String name = "";

    public Mouse(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void printMouseDetails () {
        System.out.println ("Я мышь, меня зовут " + name + " и мне " + age + " лет");
    }

}
