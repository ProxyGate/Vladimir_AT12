package homework.day2.basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn popa = new TrainMethodsReturn();
        System.out.println("метод returnNewInt вернул " + (popa.returnNewInt(14)));
        System.out.println("метод returnNewLong вернул " + (popa.returnNewLong(888L)));
        System.out.println("метод returnNewDouble вернул " + (popa.returnNewDouble(3.14)));
        System.out.println("метод returnNewBoolean вернул " + (popa.returnNewBoolean(true)));
        System.out.println("метод returnNewChar вернул " + (popa.returnNewChar('p')));
        System.out.println("метод returnNewFloat вернул " + (popa.returnNewFloat((2.2f))));
        System.out.println("метод returnNewShort вернул " + (popa.returnNewShort((short)10)));
        System.out.println("метод returnNewByte вернул " + (popa.returnNewByte((byte)10)));
    }
}
