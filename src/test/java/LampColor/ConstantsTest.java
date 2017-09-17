package LampColor;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.interviews.enums.Constants;

public class ConstantsTest {

	@Test
	public void shouldHaveCorrectValues(){
		Assert.assertEquals("HH:mm:ss", Constants.TIME_FORMAT.value());
		Assert.assertEquals("Please provide valid time in HH:mm:ss format", Constants.WRONG_INPUT.value());
		Assert.assertEquals(Constants.TIME_FORMAT, Constants.valueOf("TIME_FORMAT"));
	}
}
