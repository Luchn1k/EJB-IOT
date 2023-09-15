/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Luchn1k
 */
public class DataBuilder {

    String longitude;
    String latitude;
    String speed;
    String temp;
    String humidity;
   

    public DataBuilder() {
    }
    

    public DataBuilder(String longitude, String latitude, String speed, String temp, String humidity) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.speed = speed;
        this.temp = temp;
        this.humidity = humidity;
    }
    

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
    
    

}
