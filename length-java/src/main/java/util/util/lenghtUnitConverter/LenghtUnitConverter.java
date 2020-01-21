package util.util.lenghtUnitConverter;

import constant.LengthUnitEnum;
import service.Length;

/**
 * @author vincenzo
 * @description
 * @date 2020/1/21
 */
public abstract class LenghtUnitConverter {
     Length converter(Length val, LengthUnitEnum amiUnit){
         LengthUnitEnum originUnit=val.getUinnt();
         checkOriginUnit(originUnit);
         return doConverter(val);
     }

    /**
     * 检查原值的单位是否与转换器匹配
     * @param originUnit
     */
     protected  abstract  void  checkOriginUnit(LengthUnitEnum originUnit);

    /**
     * 正式进行值转换
     * @param val
     * @return
     */
     protected  abstract  Length  doConverter(Length val);

}
