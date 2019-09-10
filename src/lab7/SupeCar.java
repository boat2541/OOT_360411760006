package lab7;

public class SupeCar {
    private String carbrand;
    private String carcolor;
    private String carenginesize;
    private String maxspeed;
    private String countryoforigin;

    public SupeCar(String carbrand, String carcolor, String carenginesize, String maxspeed, String countryoforigin) {
        this.carbrand = carbrand;
        this.carcolor = carcolor;
        this.carenginesize = carenginesize;
        this.maxspeed = maxspeed;
        this.countryoforigin = countryoforigin;

    }


    //getter and setter methods
    public String getCarbrand() {
        return this.carbrand;
    }

    public void setCarbrand(String carbrand ) {
        this.carbrand = carbrand;
    }

    public String getCarcolor() {
        return this.carcolor;
    }

    public void setCarcolor(String carcolor ) {
        this.carcolor = carcolor;
    }

    public String getCarenginesize() {
        return this.carenginesize;
    }

    public void setCarenginesize(String carenginesize ) {
        this.carenginesize = carenginesize;
    }

    public String getMaxspeed() {
        return this.maxspeed;
    }

    public void setMaxspeed(String maxspeed ) {
        this.maxspeed = maxspeed;
    }

    public String getCountryoforigin() {
        return this.countryoforigin;
    }

    public void setCountryoforigin(String countryoforigin) {
        this.countryoforigin = countryoforigin;
    }

        public void getSuperCarinfo () {
            System.out.println(carbrand + carcolor + carenginesize + maxspeed + countryoforigin);

        }


    }//class
















