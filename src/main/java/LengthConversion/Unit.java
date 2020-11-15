package LengthConversion;

/**
 * @author paige
 * @create 2020-10-30 17:58
 */
public class Unit {
    public static Unit Inch = new Unit("Inch");
    public static Unit Foot = new Unit("Foot");
    public static Unit Yard = new Unit("Yard");
    public final String text;

    public Unit(String text) {
        this.text = text;
    }
}