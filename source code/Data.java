/*coord
coord.lon City geo location, longitude
coord.lat City geo location, latitude
weather (more info Weather condition codes)
weather.id Weather condition id
weather.main Group of weather parameters (Rain, Snow, Extreme etc.)
weather.description Weather condition within the group
weather.icon Weather icon id
base Internal parameter
main
main.temp Temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
main.pressure Atmospheric pressure (on the sea level, if there is no sea_level or grnd_level data), hPa
main.humidity Humidity, %
main.temp_min Minimum temperature at the moment. This is deviation from current temp that is possible for large cities and megalopolises geographically expanded (use these parameter optionally). Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
main.temp_max Maximum temperature at the moment. This is deviation from current temp that is possible for large cities and megalopolises geographically expanded (use these parameter optionally). Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
main.sea_level Atmospheric pressure on the sea level, hPa
main.grnd_level Atmospheric pressure on the ground level, hPa
wind
wind.speed Wind speed. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour.
wind.deg Wind direction, degrees (meteorological)
clouds
clouds.all Cloudiness, %
rain
rain.1h Rain volume for the last 1 hour, mm
rain.3h Rain volume for the last 3 hours, mm
snow
snow.1h Snow volume for the last 1 hour, mm
snow.3h Snow volume for the last 3 hours, mm
dt Time of data calculation, unix, UTC
sys
sys.type Internal parameter
sys.id Internal parameter
sys.message Internal parameter
sys.country Country code (GB, JP etc.)
sys.sunrise Sunrise time, unix, UTC
sys.sunset Sunset time, unix, UTC
timezone Shift in seconds from UTC
id City ID
name City name
cod Internal parameter*/



public class Data {

	Coord coord;
	
	Weather[] weather;
	
	String base;
	
	Main main;
	
	Wind wind;
	
	Clouds clouds;
	
	Rain rain;
	
	Snow snow;
	
	String dt;
	
	Sys sys;
	
	String timezone;
	
	String id;
	
	String name;
	
	String cod;

	public Coord getCoord() {
		return coord;
	}

	public String getBase() {
		return base;
	}

	public Main getMain() {
		return main;
	}

	public Wind getWind() {
		if(wind == null)
			return new Wind();
		return wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public Rain getRain() {
		if(rain == null)
			return new Rain();
		return rain;
	}

	public Snow getSnow() {
		if (snow == null)
			return new Snow();
		return snow;
	}

	public String getDt() {
		return dt;
	}

	public Sys getSys() {
		return sys;
	}

	public String getTimezone() {
		return timezone;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCod() {
		return cod;
	}
	public  String convertSecondsToHMmSs(long seconds) {
		seconds += 3600;
	    long s = seconds % 60;
	    long m = (seconds / 60) % 60;
	    long h = (seconds / (60 * 60)) % 24;
	    return String.format("%d:%02d:%02d", h,m,s);
	}
}

 

