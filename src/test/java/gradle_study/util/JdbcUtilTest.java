package gradle_study.util;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class JdbcUtilTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetconnection() {
		System.out.printf("%s() n" , " testGetconnection()");
		Connection con = JdbcUtil.getconnection();
		System.out.println("con  > " + con);
		Assert.assertNotNull(con);
	}

}
