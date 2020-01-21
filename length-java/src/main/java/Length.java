import constant.LengthUnitEnum;
import constant.LengthUnitEnum;


/**
 * 步骤：
 * 1、重新命名表意不明的变量名、函数名
 * 2、提取到处出现的字符串常量到一个常量类或枚举类或内部类等去管理
 * 3、替换参数为新类型的参数，需要增加一个同样代码但函数名、参数增加(用于替代原来参数，原来的参数暂时不删除用于平滑过渡)的方法，确保替换完成后删除原来旧函数将新函数名修改为旧函数名
 * 4、提炼重复的代码段：消除重复的对象创建代码
 *
 *
 */
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
