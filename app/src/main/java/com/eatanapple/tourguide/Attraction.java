package com.eatanapple.tourguide;

public class Attraction {

    String name;
    String hours;
    String location;
    int pictureResourceId;

    public Attraction(String name, String hours, String location, int pictureResourceId) {
        this.name = name;
        this.hours = hours;
        this.location = location;
        this.pictureResourceId = pictureResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPictureResourceId() {
        return pictureResourceId;
    }

    public void setPictureResourceId(int pictureResourceId) {
        this.pictureResourceId = pictureResourceId;
    }

}
