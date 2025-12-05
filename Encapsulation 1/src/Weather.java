public class Weather {
    String city;
    double windSpeed;
    double rainPercentage;
    boolean rain;
    boolean cloudy;
    boolean sunny;

    public Weather(String city, double windSpeed, int rainPercentage, boolean rain, boolean cloudy, boolean sunny) {
        this.city = city;
        this.windSpeed = windSpeed;
        this.rainPercentage = this.rainPercentage;
        this.rain = rain;
        this.cloudy = cloudy;
        this.sunny = sunny;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getWindSpeed(){
        return windSpeed;
    }
    public void setWindSpeed(double windSpeed){
        if(windSpeed<0){
            return;
        }
        this.windSpeed=windSpeed;
    }

    public double getRainPercentage() {
        return rainPercentage;
    }
    public void setRainPercentage(double rainPercentage){
        if(rainPercentage<0){
            return;
        }
        this.rainPercentage=rainPercentage;
    }
    public boolean setRain(){
        return rain;
    }
    public void getRain(boolean rain){
        this.rain=rain;
    }
    public boolean setCloudy(){
        return cloudy;
    }
    public void getCloudy(boolean cloudy){
        this.cloudy=cloudy;
    }
    public boolean setSunny(){
        return sunny;
    }
    public void getSunny(boolean sunny){
        this.sunny=sunny;
    }

    public boolean shouldWalk(){
        if (rain){
            return false;
        }
        if (rainPercentage > 20){
            return false;
        }
        if (windSpeed > 15) {
            return false;
        }
        if (sunny && rainPercentage <= 20){
            return true;
        }
        if (cloudy && rainPercentage <= 20 && windSpeed <= 15){
            return true;
        }
        return false;
    }

    public void display() {
        System.out.println(city);
        System.out.printf("Wind Speed: " + windSpeed);
        System.out.println("Rain %: " + rainPercentage);
        System.out.println("Will Rain: " + rain);
        System.out.println("Cloudy: " + cloudy);
        System.out.println("Sunny: " + sunny);
        System.out.println("Should go for a walk? " + shouldWalk());
    }



}
