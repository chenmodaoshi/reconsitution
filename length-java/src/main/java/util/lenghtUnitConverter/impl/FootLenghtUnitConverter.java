package util.lenghtUnitConverter.impl;

import constant.LengthUnitEnum;
import service.Length;
import util.util.lenghtUnitConverter.LenghtUnitConverter;

/**
 * @author vincenzo
 * @description
 * @date 2020/1/21
 */
public class FootLenghtUnitConverter extends LenghtUnitConverter {
    @Override
    protected void checkOriginUnit(LengthUnitEnum originUnit) throws  Exception{
        if(!(LengthUnitEnum.FOOT==originUnit)){
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
        if (LengthUnitEnum.YARD==amiUnit) {
            return new Length(val.getVal() / 3, LengthUnitEnum.YARD);
        }
        if (LengthUnitEnum.INCH==amiUnit) {
            return new Length(val.getVal()* 12, LengthUnitEnum.INCH);
        }
        return val;
    }
}
