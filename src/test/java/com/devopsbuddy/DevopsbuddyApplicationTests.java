package com.devopsbuddy;

import com.devopsbuddy.web.i18n.I18NService;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsbuddyApplicationTests {

	@Autowired
	private I18NService i18NService;


	@Test
	public void testMessageByLocalService() throws Exception{
		String expectedResult="Bootstrap starter templates";
		String messageId="index.main.callout";
		String actual=i18NService.getMessage(messageId);
		Assert.assertEquals("The actual and expected Strings don't match", expectedResult, actual);

	}


}
