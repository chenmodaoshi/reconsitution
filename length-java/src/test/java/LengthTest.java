import constant.LengthUnitEnum;
import org.junit.Test;
import service.Length;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthTest {
    @Test
    public void should_1_inch_equals_1_inch()throws  Exception  {
        Length result = new Length(1, LengthUnitEnum.INCH).convertUnit(LengthUnitEnum.INCH);

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is(LengthUnitEnum.INCH));
    }

    @Test
    public void should_2_feet_equals_2_feet()throws  Exception  {
        Length result = new Length(2, LengthUnitEnum.FOOT).convertUnit(LengthUnitEnum.FOOT);

        assertThat(result.getVal(), is(2.0));
        assertThat(result.getUinnt(), is(LengthUnitEnum.FOOT));
    }

    @Test
    public void should_1_yard_equals_1_yard()throws  Exception  {
        Length result = new Length(1, LengthUnitEnum.YARD).convertUnit(LengthUnitEnum.YARD);

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is(LengthUnitEnum.YARD));
    }

    @Test
    public void should_1_foot_equals_12_inches()throws  Exception  {
        Length result = new Length(1, LengthUnitEnum.FOOT).convertUnit(LengthUnitEnum.INCH);

        assertThat(result.getVal(), is(12.0));
        assertThat(result.getUinnt(), is(LengthUnitEnum.INCH));
    }

    @Test
    public void should_3_foot_equals_1_yard()throws  Exception  {
        Length result = new Length(3, LengthUnitEnum.FOOT).convertUnit(LengthUnitEnum.YARD);

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is(LengthUnitEnum.YARD));
    }

    @Test
    public void should_1_yard_equals_3_feet()throws  Exception  {
        Length result = new Length(1, LengthUnitEnum.YARD).convertUnit(LengthUnitEnum.FOOT);

        assertThat(result.getVal(), is(3.0));
        assertThat(result.getUinnt(), is(LengthUnitEnum.FOOT));
    }

    @Test
    public void should_1_yard_equals_36_inches()throws  Exception  {
        Length result = new Length(1, LengthUnitEnum.YARD).convertUnit(LengthUnitEnum.INCH);

        assertThat(result.getVal(), is(36.0));
        assertThat(result.getUinnt(), is(LengthUnitEnum.INCH));
    }

    @Test
    public void should_2_yards_equals_72_inches()throws  Exception  {
        Length result = new Length(2, LengthUnitEnum.YARD).convertUnit(LengthUnitEnum.INCH);

        assertThat(result.getVal(), is(72.0));
        assertThat(result.getUinnt(), is(LengthUnitEnum.INCH));
    }

    @Test
    public void should_12_inches_equals_1_foot()throws  Exception  {
        Length result = new Length(12, LengthUnitEnum.INCH).convertUnit(LengthUnitEnum.FOOT);

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is(LengthUnitEnum.FOOT));
    }

    @Test
    public void should_36_inches_equals_1_yard()throws  Exception  {
        Length result = new Length(36, LengthUnitEnum.INCH).convertUnit(LengthUnitEnum.YARD);

        assertThat(result.getVal(), is(1.0));
        assertThat(result.getUinnt(), is(LengthUnitEnum.YARD));
    }

    @Test
    public void should_18_inches_equals_half_yard()throws  Exception  {
        Length result = new Length(18, LengthUnitEnum.INCH).convertUnit(LengthUnitEnum.YARD);

        assertThat(result.getVal(), is(0.5));
        assertThat(result.getUinnt(), is(LengthUnitEnum.YARD));
    }
}
