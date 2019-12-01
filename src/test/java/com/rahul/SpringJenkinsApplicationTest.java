package com.rahul;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringJenkinsApplicationTest {
	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplicationTest.class);
	
	@Test
	public void contextLoads() {	
		logger.info("Test Case Executing..");
		assertEquals(true,true);
	}

	public SpringJenkinsApplicationTest()
	{}
	
}
