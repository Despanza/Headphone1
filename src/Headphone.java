import java.awt.*;
/*
Sterling Despanza
Headphone.java
30 September 2019
A program that prints the information of a set of headphones as a string using methods.
 */

public class Headphone{

    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;
    private int volume;
    private boolean pluggedIn;
    private String manufacturer;
    private Color headPhoneColor;
    private String headPhoneModel;

    public Headphone(int volume, boolean pluggedIn, String manufacturer, Color headPhoneColor, String headPhoneModel){
        this.volume = volume;
        this.pluggedIn = pluggedIn;
        this.manufacturer = manufacturer;
        this.headPhoneColor = headPhoneColor;
        this.headPhoneModel = headPhoneModel;

    }

    public Headphone(){
        this.volume = HIGH;
        this.pluggedIn = false;
        this.manufacturer = "Sennheiser";
        this.headPhoneColor = Color.BLACK;
        this.headPhoneModel = "HD800";
    }

    public int getVolume(){
        return this.volume;
    }

    public boolean getPluggedIn(){
        return this.pluggedIn;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public String getHeadPhoneColor(){
        if(Color.BLACK.equals(this.headPhoneColor)) {
            return "Black";
        }
        return null;
    }

    public String getHeadPhoneModel(){
        return this.headPhoneModel;
    }

    public String toString(){
        String stVal = "(Volume: " + getVolume() + ", Plugged in: " + getPluggedIn() + ", Headphone Color: " + getHeadPhoneColor() + ", Manufacturer: " + getManufacturer() + ", Headphone Model: " + getHeadPhoneModel() +  ")";
        return stVal;
    }

}