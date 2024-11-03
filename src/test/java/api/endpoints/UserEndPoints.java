package api.endpoints;



import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class UserEndPoints {
	
	private static final String API_KEY = "MEaEM43XwloTWxIYKT5RyEaOXC4VpQOQ"; 

	public static Response readAdmin(String In)
	{
		
		Response response=given()
				
				.queryParam("apikey", API_KEY)
				.pathParam("in", In)
				.log().all()
				.when()
				.get(Routes.get_admin);
		return response;
	}
	
	public static Response getCountry(String RegionCode)
	{
		
		Response response=given()
				
				.queryParam("apikey", API_KEY)
				.pathParam("regionCode", RegionCode)
				.log().all()
				.when()
				.get(Routes.get_country);
		return response;
	}
	
	public static Response getCountryUnauth(String RegionCode,String API_KEY)
	{
		
		Response response=given()
				
				.queryParam("apikey", API_KEY)
				.pathParam("regionCode", RegionCode)
				.log().all()
				.when()
				.get(Routes.get_country);
		return response;
	}
	
	public static Response getOneDayWeather(String Location)
	{
		
		Response response=given()
				
				.queryParam("apikey", API_KEY)
				//.pathParam("LocationKey", Location)
				//.log().all()
				.when()
				.get(Routes.get_OneDay_weather);
		return response;
	}
	

}
