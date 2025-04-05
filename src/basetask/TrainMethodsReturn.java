package basetask;

public class TrainMethodsReturn {
    public int returnNewInt (int Z) {
        return (Z*3);
    }
    public long returnNewLong (long Z) {
        return (Z-4);
    }
    public String returnNewChar (char Z) {
        String qwe = "" + Z + Z;
        return qwe;
    }
    public float returnNewFloat (float Z) {
        return (Z/2);
    }
    public double returnNewDouble (double Z) {
        return (Z+8);
    }
    public short returnNewShort (short Z) {
        return (short) (Z-1);
    }
    public byte returnNewByte (byte Z) {
        return (byte) (Z*2);
    }
    public Boolean returnNewBoolean (Boolean Z) {
        return Z;
    }

}
