package com.eatanapple.tourguide;

public class Attraction {

    String name;
    String hours;
    String location;
    String type;

    public Attraction(String name, String hours, String location, String type) {
        this.name = name;
        this.hours = hours;
        this.location = location;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Attractions{" +
                "name='" + name + '\'' +
                ", hours='" + hours + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
