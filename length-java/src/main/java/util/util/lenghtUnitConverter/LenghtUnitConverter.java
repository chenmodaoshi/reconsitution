package util.util.lenghtUnitConverter;

import constant.LengthUnitEnum;
import service.Length;

/**
 * @author vincenzo
 * @description
 * @date 2020/1/21
 */
public abstract class LenghtUnitConverter {
    /**
     * 应用模板方法
     * @param val
     * @param amiUnit
     * @return
     * @throws Exception
     */
     public Length converter(Length val, LengthUnitEnum amiUnit)throws  Exception{
         //校验原值的单位是否与转换器匹配
         LengthUnitEnum originUnit=val.getUinnt();
         checkOriginUnit(originUnit);
         //正式进行值转换
         return doConverter(val,amiUnit);
     }

    /**
     * 检查原值的单位是否与转换器匹配
     * @param originUnit
     */
     protected  abstract  void  checkOriginUnit(LengthUnitEnum originUnit) throws  Exception;

    /**
     * 正式进行值转换
     * @param val
     * @return
     */
     protected  abstract  Length  doConverter(Length val,LengthUnitEnum amiUnit);

}
