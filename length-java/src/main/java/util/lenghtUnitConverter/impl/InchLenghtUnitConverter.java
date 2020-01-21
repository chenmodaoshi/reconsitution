package util.lenghtUnitConverter.impl;

import constant.LengthUnitEnum;

import service.Length;
import util.util.lenghtUnitConverter.LenghtUnitConverter;

/**
 * @author vincenzo
 * @description
 * @date 2020/1/21
 */
public class InchLenghtUnitConverter  extends LenghtUnitConverter {
    @Override
    protected void checkOriginUnit(LengthUnitEnum originUnit) throws  Exception{
        if(!(LengthUnitEnum.INCH==originUnit)){
            throw new Exception("长度单位转换器与传参不匹配！！！");
        }
    }

    /**
     * 使用卫语句进行转制
     * @param val
     * @param amiUnit
     * @return
     */
    @Override
    protected Length doConverter(Length val,LengthUnitEnum amiUnit) {
        //转FOOT
        if (amiUnit == LengthUnitEnum.FOOT) {
            return new Length(val.getVal() / 12, LengthUnitEnum.FOOT);
        }
        //转YARD
        if (amiUnit == LengthUnitEnum.YARD) {
            return new Length(val.getVal() / 36, LengthUnitEnum.YARD);
        }

        return val;
    }
}
