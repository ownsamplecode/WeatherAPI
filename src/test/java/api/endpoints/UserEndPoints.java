package api.endpoints;



import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class UserEndPoints {

	public static Response readAdmin(String In)
	{
		
		Response response=given()
				.auth().oauth2("MEaEM43XwloTWxIYKT5RyEaOXC4VpQOQ")
				.pathParam("in", In)
				.when()
				.get(Routes.get_admin);
		return response;
	}
	
	public static Response getCountry(String RegionCode)
	{
		
		Response response=given()
				.auth().oauth2("MEaEM43XwloTWxIYKT5RyEaOXC4VpQOQ")
				.pathParam("regionCode", RegionCode)
				.when()
				.get(Routes.get_country);
		return response;
	}

}
