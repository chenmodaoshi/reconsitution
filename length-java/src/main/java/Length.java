import constant.LengthUnit;

public class Length {
    private final double value;
    private final String unit;

    public Length(double val, String uinnt) {
        this.value = val;
        this.unit = uinnt;
    }

    public Length as(String u) {
        Length len = this;
        if (this.unit.equals(LengthUnit.FOOT)) {
            if (u.equals(LengthUnit.YARD)) {
                len = new Length(this.value / 3, u);
            } else if (u.equals(LengthUnit.INCH)) {
                len = new Length(this.value * 12, u);
            }
        }

        if (this.unit.equals(LengthUnit.YARD)) {
            if (u.equals(LengthUnit.INCH)) {
                len = new Length(this.value * 36, u);
            } else if (u.equals(LengthUnit.FOOT)){
                len = new Length(this.value * 3, u);
            }
        }

        if (this.unit.equals(LengthUnit.INCH)) {
            if (u.equals(LengthUnit.FOOT)) {
                len = new Length(this.value / 12, u);
            } else if (u.equals(LengthUnit.YARD)) {
                len = new Length(this.value / 36, u);
            }
        }

        return len;
    }

    public double getVal() {
        return this.value;
    }

    public String getUinnt() {
        return this.unit;
    }
}
