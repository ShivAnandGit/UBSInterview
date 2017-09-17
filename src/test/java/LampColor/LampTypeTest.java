package LampColor;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.interviews.enums.LampType;

public class LampTypeTest {
	@Test
	public void shouldHaveCorrectValues(){
		Assert.assertEquals(LampType.HOURS_LAMP, LampType.valueOf("HOURS_LAMP"));
		Assert.assertEquals(LampType.MINUTES_LAMP, LampType.valueOf("MINUTES_LAMP"));
		Assert.assertEquals(LampType.SECONDS_LAMP, LampType.valueOf("SECONDS_LAMP"));
	}

}
