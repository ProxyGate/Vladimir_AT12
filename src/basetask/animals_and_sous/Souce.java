package basetask.animals_and_sous;

public class Souce {
    private String name = "";
    private String color = "";

    public void setName (String name) {
        this.name = name;
    }

    public void setColor (String name) {
        this.color = color;
    }

    public String getName () {
        return name;
    }

    public String getColor () {
        return color;
    }

    public void printSouceDetails () {
        System.out.println("Это соус " + name + " " + color + " цвета");
    }

}
