package model;

public class Customer {
    private String city;
    private String street;
    private String houseNum;
    private int apartmentNum;
    private int floor;
    private int phoneNum;

    public Customer(String city, String street, String houseNum, int apartmentNum, int floor, int phoneNum) {
        this.city = city;
        this.street = street;
        this.houseNum = houseNum;
        this.apartmentNum = apartmentNum;
        this.floor = floor;
        this.phoneNum = phoneNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public int getApartmentNum() {
        return apartmentNum;
    }

    public void setApartmentNum(int apartmentNum) {
        this.apartmentNum = apartmentNum;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
}
