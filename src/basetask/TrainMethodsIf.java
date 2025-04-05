package basetask;

public class TrainMethodsIf {
    public int returnNewInt (int iks) {
        if (iks < 8)
        {return (iks*7); }
        else  { return iks/4; }
    }
    public long returnNewLong (long iks) {
        if (iks > 300) {
            return (iks-300); }
        else {
            return (iks+20); }
    }
    public String returnNewChar (char iks) {
        String qwe;
        if (iks == 'g') {
            qwe = iks + "o";
            return qwe; }
        else {
            qwe = "o" + iks;
            return qwe; }
    }
    public float returnNewFloat (float iks) {
        if (iks == 0.67) {
            return iks/2; }
        else {
            return iks*2; }
    }
    public double returnNewDouble (double iks) {
        if (iks > 30 & iks < 80) {
            return iks+87; }
        else if (iks > 80 & iks < 400) {
            return iks-87;}
        else if (iks >400 ) {
            return iks/4;}
        else {
            return iks; }
        }
    public void returnNewBoolean (boolean iks) {
        if (iks) {
            System.out.println("Я получил на вход значение истины"); }
        else {
            System.out.println("Я получил на вход ложь"); }
    }
    }
