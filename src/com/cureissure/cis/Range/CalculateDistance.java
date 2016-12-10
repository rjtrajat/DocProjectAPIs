package com.cureissure.cis.Range;

public class CalculateDistance {

	public static boolean IsInRange(double longitude_user,double latitude_user,double longitude_target,double latitude_target){
		

		 double AVERAGE_RADIUS_OF_EARTH_KM = 6371;
		 double latDistance;
		 double lngDistance;
		 double a;
		 double c;
		 double distance;

			  latDistance = Math.toRadians(latitude_user - latitude_target);
			     lngDistance = Math.toRadians(longitude_user - longitude_target);
			     a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
			      + Math.cos(Math.toRadians(latitude_user)) * Math.cos(Math.toRadians(latitude_target))
			      * Math.sin(lngDistance / 2) * Math.sin(lngDistance / 2);
			     c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

			     distance =  (Math.round(AVERAGE_RADIUS_OF_EARTH_KM * c));
			     
			     if(distance<5)
			     return true;
		
			     return false;
		
		
	}
	
	
}
