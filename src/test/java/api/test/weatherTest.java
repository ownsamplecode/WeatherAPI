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
		
		data=new userData();
		data.setIn("in");
		data.setRegioncode("ASI");
		data.setLocationKey("204842");
		
		
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
		
		Response response=UserEndPoints.getCountryUnauth(data.getRegioncode(),"MEaEM43XwloTWxIYKT5RyEaOXC4VpQQQ");
		org.testng.Assert.assertEquals(response.getStatusCode(),401);
		
	}
	@Test(priority = 3)
	public void testCountry()
	{
	
		Response response=UserEndPoints.getCountry(data.getRegioncode());
		org.testng.Assert.assertEquals(response.getStatusCode(),200);
		
	}
	@Test(priority = 4)
	public void testOneDayWeather()
	{
	
		Response response=UserEndPoints.getCountry(data.getLocationKey());
		org.testng.Assert.assertEquals(response.getStatusCode(),200);
		//System.out.println("Response Body: " + response.asString());
		//response.then().log().all();
		
		
		
		System.out.println("Status Code: " + response.getStatusCode());
	    System.out.println("Content-Type: " + response.getHeader("Content-Type"));

	    // Print raw response body
	    String responseBody = response.getBody().asString();
	    System.out.println("Response Body: " + responseBody);

	    if (responseBody.equals("[]")) {
	        System.out.println("No data found for the specified region code.");
	    } else {
	        System.out.println("Response Body (formatted): " + response.prettyPrint());
	    }
		
	}
}
