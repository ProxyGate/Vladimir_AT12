package homework.day2.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf DyadyaBogdanoid = new TrainMethodsIf();
        System.out.println("метод returnNewInt вернул " + (DyadyaBogdanoid.returnNewInt(13)));
        System.out.println("метод returnNewLong вернул " + (DyadyaBogdanoid.returnNewLong(13)));
        System.out.println("метод returnNewChar вернул " + (DyadyaBogdanoid.returnNewChar('y')));
        System.out.println("метод returnNewFloat вернул " + (DyadyaBogdanoid.returnNewFloat(13)));
        System.out.println("метод returnNewDouble вернул " + (DyadyaBogdanoid.returnNewDouble(13)));
        DyadyaBogdanoid.returnNewBoolean(true);
    }
}
