package homework.day2.basetask.animals_and_sous;

public class Bee {
    String gender = "";
    long weight = 0;

    public Bee(String gender, long weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public void setWeight (long weight) {
        this.weight = weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public long getWeight() {
        return weight;
    }

}
