import static java.lang.String.format;

/**
 * @author paige
 * @create 2020-10-29 17:04
 */
public class Length {
    private int amountInInch;
    private int amount;
    private Unit unit;

    public Length(int amount, Unit unit) {
        this.amount = amount;
        this.unit = unit;
        if (unit == Unit.Foot) {
            this.amountInInch = 12 * amount;
        }
        else if (unit == Unit.Yard) {
            this.amountInInch = 36 * amount;
        }
        else {
            this.amountInInch = amount;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return amountInInch == length.amountInInch;
    }

    @Override
    public String toString() {
        return format("%d (%s)", amount, unit.text);
    }
}