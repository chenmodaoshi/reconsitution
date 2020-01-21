package constant;

public enum LengthUnitEnum {
    FOOT("FOOT"),
    YARD("YARD"),
    INCH("INCH");
    private String unit;
    LengthUnitEnum(String unit){
        this.unit=unit;
    }
}
