import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author paige
 * @create 2020-10-29 17:03
 */
public class LengthTest {
    @Test
    public void should_create_inch_with_given_amount() {
        Length length = new Length(1, "Inch");
    }

    @Test
    public void should_1_inch_equals_1_inch() {
        assertThat(new Length(1, "Inch"), is(new Length(1, "Inch")));
    }

    @Test
    public void should_display_internal_information_friendly() {
        assertThat(new Length(1, "Inch").toString(), is("1 (Inch)"));
        assertThat(new Length(1, "Foot").toString(), is("1 (Foot)"));
    }

    @Test
    public void should_1_foot_equals_12_inches() {
        assertThat(new Length(1, "Foot"), is(new Length(12, "Inch")));
    }

    @Test
    public void should_1_yard_equals_3_feet() {
        assertThat(new Length(1, "Yard"), is(new Length(3, "Foot")));
    }

}