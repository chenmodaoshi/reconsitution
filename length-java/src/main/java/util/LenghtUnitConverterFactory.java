package util;

import constant.LengthUnitEnum;
import util.lenghtUnitConverter.impl.FootLenghtUnitConverter;
import util.lenghtUnitConverter.impl.InchLenghtUnitConverter;
import util.lenghtUnitConverter.impl.YardLenghtUnitConverter;
import util.util.lenghtUnitConverter.LenghtUnitConverter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vincenzo
 * @description 长度单位转制工厂类
 * @date 2020/1/21
 */
public class LenghtUnitConverterFactory {
    //长度单位转制器map 保存转制器避免重复new  使用static确保全局唯一
    private final  static Map<LengthUnitEnum,LenghtUnitConverter> lenghtUnitConverterMap=new HashMap<LengthUnitEnum, LenghtUnitConverter>();

    /**
     *
     * @param originUnit 原先单位
     * @return
     */
    public LenghtUnitConverter buildLenghtUnitConverter(LengthUnitEnum originUnit){
        LenghtUnitConverter lenghtUnitConverter=lenghtUnitConverterMap.get(originUnit);
        if(lenghtUnitConverter!=null){
            return lenghtUnitConverter;
        }

        //获取原先单位转换器
        switch(originUnit){
            case INCH:
                lenghtUnitConverter=new InchLenghtUnitConverter();
                break;
            case YARD:
                lenghtUnitConverter=new YardLenghtUnitConverter();
                break;
            case FOOT:
                lenghtUnitConverter=new FootLenghtUnitConverter();
                break;
            default:throw new IllegalArgumentException("原长度单位不存在") ;
        }
        //保存转制单位 以避免重复使用重复new
        lenghtUnitConverterMap.put(originUnit,lenghtUnitConverter);

        return lenghtUnitConverter;

    }

}
