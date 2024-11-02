package api.endpoints;



public class Routes {
	
		public static String base_url= "http://dataservice.accuweather.com/locations/v1";
		
		//Locations API
		
		public static String get_admin = base_url+"/adminareas/{in}";
		public static String get_country= base_url+"/countries/{regionCode}";		
		public static String get_OneDay_weather=base_url+ base_url+"/daily/1day/{locationKey}";
		// For Mumbai =204842
		
		// Forecast API
		
		
		//
		
}
	