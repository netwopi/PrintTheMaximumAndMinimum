public class AllPrimitives {

    private final int minByte = Byte.MIN_VALUE;
    private final int maxByte = Byte.MAX_VALUE;

    private final int minShort = Short.MIN_VALUE;
    private final int maxShort = Short.MAX_VALUE;

    private final int minInt = Integer.MIN_VALUE;
    private final int maxInt = Integer.MAX_VALUE;

    private final long minLong = Long.MIN_VALUE;
    private final long maxLong = Long.MAX_VALUE;

    private final double maxDouble = Double.MAX_VALUE;
    private final double minDouble = Double.MIN_VALUE;

    private final double maxFloat = Float.MIN_VALUE;
    private final double minFloat = Float.MAX_VALUE;

    public AllPrimitives() {
    }

    public int getMinByte() {
        return minByte;
    }

    public int getMaxByte() {
        return maxByte;
    }

    public int getMinShort() {
        return minShort;
    }

    public int getMaxShort() {
        return maxShort;
    }

    public int getMinInt() {
        return minInt;
    }

    public int getMaxInt() {
        return maxInt;
    }

    public long getMinLong() {
        return minLong;
    }

    public long getMaxLong() {
        return maxLong;
    }

    public double getMaxDouble() {
        return maxDouble;
    }

    public double getMinDouble() {
        return minDouble;
    }

    public double getMaxFloat() {
        return maxFloat;
    }

    public double getMinFloat() {
        return minFloat;
    }

    @Override
    public String toString() {
        return
                " minByte=" + minByte +"\n"+
                " maxByte=" + maxByte +"\n"+
                " minShort=" + minShort +"\n"+
                " maxShort=" + maxShort +"\n"+
                " minInt=" + minInt +"\n"+
                " maxInt=" + maxInt +"\n"+
                " minLong=" + minLong +"\n"+
                " maxLong=" + maxLong +"\n"+
                " maxDouble=" + maxDouble +"\n"+
                " minDouble=" + minDouble +"\n"+
                " maxFloat=" + maxFloat +"\n"+
                " minFloat=" + minFloat +"\n";
    }
}
