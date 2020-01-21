package service;

import constant.LengthUnitEnum;
import util.LenghtUnitConverterFactory;
import util.util.lenghtUnitConverter.LenghtUnitConverter;


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

    public Length temp_as(LengthUnitEnum u) {
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

    public Length as(LengthUnitEnum aimUnit)throws  Exception {
        //以卫语句取代嵌套条件式：根据当前单位和目标单位进行转换
        Length len = this;

        switch(this.unit){
            case INCH:
                LenghtUnitConverter inchUnitConverter= LenghtUnitConverterFactory.buildLenghtUnitConverter(LengthUnitEnum.INCH);
                len=inchUnitConverter.converter(this,aimUnit);
                break;
            case YARD:
                LenghtUnitConverter yardUnitConverter= LenghtUnitConverterFactory.buildLenghtUnitConverter(LengthUnitEnum.YARD);
                len=yardUnitConverter.converter(this,aimUnit);
                break;
            case FOOT:
                LenghtUnitConverter footUnitConverter= LenghtUnitConverterFactory.buildLenghtUnitConverter(LengthUnitEnum.FOOT);
                len=footUnitConverter.converter(this,aimUnit);
                break;
            //default:throw new IllegalArgumentException("原长度单位不存在") ;
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
