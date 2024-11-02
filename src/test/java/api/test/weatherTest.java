package api.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import api.endpoints.UserEndPoints;
import api.payload.userData;
import io.restassured.response.Response;

public class weatherTest {
	
	userData data;

	@BeforeClass
	public void setData()
	{
		
		userData data=new userData();
		data.setIn("in");
		data.setRegioncode("ASI");
		
	}
	
	@Test(priority = 1)	
	public void testReadAdmin()
	{
		Response response=UserEndPoints.readAdmin(data.getIn());
		org.testng.Assert.assertEquals(response.getStatusCode(),200);
		
	}
	
	@Test(priority = 2)
	public void testCountryUnauth()
	{
		//Response response=UserEndPoints.getCountry(userData.in2);
		Response response=UserEndPoints.getCountry(data.getRegioncode());
		org.testng.Assert.assertEquals(response.getStatusCode(),401);
		
	}
	public void testCountry()
	{
		//Response response=UserEndPoints.getCountry(userData.in2);
		Response response=UserEndPoints.getCountry(data.getRegioncode());
		org.testng.Assert.assertEquals(response.getStatusCode(),200);
		
	}
}
