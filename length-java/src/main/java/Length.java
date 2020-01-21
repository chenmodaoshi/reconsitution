import constant.LengthUnitEnum;
import constant.LengthUnitEnum;

public class Length {
    private final double value;
    private final LengthUnitEnum unit;

    public Length(double val, LengthUnitEnum uinnt) {
        this.value = val;
        this.unit = uinnt;
    }

    public Length as(LengthUnitEnum u) {
        Length len = this;
        if (this.unit.equals(LengthUnitEnum.FOOT)) {
            if (u.equals(LengthUnitEnum.YARD)) {
                len = new Length(this.value / 3, u);
            } else if (u.equals(LengthUnitEnum.INCH)) {
                len = new Length(this.value * 12, u);
            }
        }

        if (this.unit.equals(LengthUnitEnum.YARD)) {
            if (u.equals(LengthUnitEnum.INCH)) {
                len = new Length(this.value * 36, u);
            } else if (u.equals(LengthUnitEnum.FOOT)){
                len = new Length(this.value * 3, u);
            }
        }

        if (this.unit.equals(LengthUnitEnum.INCH)) {
            if (u.equals(LengthUnitEnum.FOOT)) {
                len = new Length(this.value / 12, u);
            } else if (u.equals(LengthUnitEnum.YARD)) {
                len = new Length(this.value / 36, u);
            }
        }

        return len;
    }

    public double getVal() {
        return this.value;
    }

    public LengthUnitEnum getUinnt() {
        return this.unit;
    }
}
