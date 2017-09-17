package LampColor;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.interviews.enums.LampColor;

public class LampColorTest {
	
	@Test
	public void shouldHaveCorrectValues(){
		Assert.assertEquals("R", LampColor.RED.value());
		Assert.assertEquals("Y", LampColor.YELLOW.value());
		Assert.assertEquals("O", LampColor.OFF.value());
		Assert.assertEquals(LampColor.RED, LampColor.valueOf("RED"));
	}
}
