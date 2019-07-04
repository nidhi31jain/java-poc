package com.poc.collection;

public class Jersey {

    private int id;
    private String size;
    private String brand;
    private String club;
    private String year;
    private String type;
    private String cut;

    public Jersey(int id, String size, String brand, String club, String year, String type, String cut) {
        this.id = id;
        this.size = size;
        this.brand = brand;
        this.club = club;
        this.year = year;
        this.type = type;
        this.cut = cut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut;
    }

    @Override
    public String toString() {
        return "Jersey{" +
                "id=" + id +
                ", size='" + size + '\'' +
                ", brand='" + brand + '\'' +
                ", club='" + club + '\'' +
                ", year='" + year + '\'' +
                ", type='" + type + '\'' +
                ", cut='" + cut + '\'' +
                '}';
    }
}
