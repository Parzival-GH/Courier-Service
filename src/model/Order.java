package model;

public class Order {

    private String desiredDeliveryTime;
    private String parcelDimensions;
    private double parcelWeight;
    private double parcelPrice;

    public Order(String desiredDeliveryTime, String parcelDimensions, double parcelWeight, double parcelPrice) {
        this.desiredDeliveryTime = desiredDeliveryTime;
        this.parcelDimensions = parcelDimensions;
        this.parcelWeight = parcelWeight;
        this.parcelPrice = parcelPrice;
    }

    public String getDesiredDeliveryTime() {
        return desiredDeliveryTime;
    }

    public void setDesiredDeliveryTime(String desiredDeliveryTime) {
        this.desiredDeliveryTime = desiredDeliveryTime;
    }

    public String getParcelDimensions() {
        return parcelDimensions;
    }

    public void setParcelDimensions(String parcelDimensions) {
        this.parcelDimensions = parcelDimensions;
    }

    public double getParcelWeight() {
        return parcelWeight;
    }

    public void setParcelWeight(double parcelWeight) {
        this.parcelWeight = parcelWeight;
    }

    public double getParcelPrice() {
        return parcelPrice;
    }

    public void setParcelPrice(double parcelPrice) {
        this.parcelPrice = parcelPrice;
    }
}
